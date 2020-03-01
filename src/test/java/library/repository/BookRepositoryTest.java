package library.repository;

import library.entity.Librarian;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    LibrarianRepository librarianRepository;


    @Test
    void findall(){
        System.out.println(bookRepository.findAll());
    }



}