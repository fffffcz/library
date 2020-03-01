package library;

import library.entity.Librarian;
import library.repository.LibrarianRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@SpringBootTest
class LibraryApplicationTests {

	@Autowired
	LibrarianRepository librarianRepository;

	@Test
	void contextLoads() {
		System.out.println(librarianRepository.findById(2342342l));
	}

	@Test
	void delete(){
		Long ll=1223423l;
		if (librarianRepository.findById(ll).isPresent()){
			System.out.println("112321sdfcs");
			librarianRepository.deleteById(ll);
		}
	}

	@Autowired
	DataSource dataSource;
	@Test
	void dataSourceTest() throws SQLException {
		System.out.println(dataSource.getClass());
		Connection connection=dataSource.getConnection();
		System.out.println(connection);
		connection.close();

	}



}
