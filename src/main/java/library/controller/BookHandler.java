package library.controller;

import library.entity.Book;
import library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.support.JdbcUtil;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/book")
public  class BookHandler {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/findAll")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @PostMapping("/save")
    public String save(@RequestBody Book book) {
        Book result = bookRepository.save(book);
        if (result != null) return "success";
        return "error";
    }

    private EntityManager em;
    @PersistenceContext(name = "EntityManagerFactory")
    public void setEntityManager(EntityManager em){
        this.em=em;
    }

    @Transactional
    @PostMapping("/saveAll/{k}")
    public String saveALl(@RequestBody Book book, @PathVariable("k") int k) {  //一次存k本书
        try{
            for(int i=0;i<k;i++){
                em.persist(new Book(book));
                if(i%50==0 || i<k-1){
                    em.flush();
                    em.clear();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("存储失败");
            return  "error";
        }
        return "success";
    }
}

