package library.repository;

import library.entity.Book;
import library.entity.Librarian;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
}
//    INSERT INTO scheduling_subpaint
//        (id,scheme_id, project_id, city, creat_time, company_id,fh_name)
//    VALUES
//            <foreach collection ="newList" index="index" item="item" separator =",">
//        (REPLACE(UUID(),'-',''),#{programmeId},#{item.id},#{city},#{createTime},#{companyId},#{fhName})
//</foreach >
