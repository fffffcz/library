package library.controller;


import library.entity.Librarian;
import library.repository.LibrarianRepository;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/librarian") //RequestMapping写method的话默认get，post都支持
public class LibrarianHandler {  //对Librarian进行操作，不是Librarian执行的操作

    @Autowired
    private LibrarianRepository librarianRepository;

    @RequestMapping("/findAll")
    public List<Librarian> findAll(){
        return  librarianRepository.findAll();
    }

    @RequestMapping("/findAll/{page}/{size}")
    public Page<Librarian> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest pageRequest=PageRequest.of(page,size); //第几页（从0开始数），每页多大（几条记录）
        return librarianRepository.findAll(pageRequest); //返回值是Page对象，是分页后的结果
    }

    @PostMapping("/save")
    public Long save(@RequestBody Librarian librarian){ //前端传回来的是json数据，必须加 @RequestBody注解转为Java对象
        Librarian result=librarianRepository.save(librarian);
        if (result!=null) {
            return result.getId();
        }else {
            return -1l;
        }
    }

    @GetMapping("/findById/{id}")
    public Librarian findById(@PathVariable("id") Long id){
        Librarian librarian=librarianRepository.findById(id).get();
        return librarian;
    }

    @RequestMapping("/findByLibrarianName/{name}")
    public Librarian findByName(@PathVariable("name") String name){
        Librarian librarian=librarianRepository.findLibrarianByLibrarianName(name);
        return librarian; //若不存在就返回空
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Long id){
        if (librarianRepository.findById(id).isPresent()){
            librarianRepository.deleteById(id);
            return "success";
        }else System.out.println("待删除id不存在");
        return "error";
    }

    @RequestMapping("/existsByLibrarianName/{name}")
    public boolean find(@PathVariable("name")String name){
        return librarianRepository.existsByLibrarianName(name);
    }


}
