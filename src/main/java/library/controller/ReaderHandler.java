package library.controller;

import library.entity.Reader;
import library.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reader")
public class ReaderHandler {

    @Autowired
    private ReaderRepository readerRepository;

    @RequestMapping("/findByReaderName/{phoneNum}")  //为了和前端的登陆逻辑统一，所以这里还是findByReaderName，因为其他两个都是name
    public Reader findByName(@PathVariable("phoneNum") String phoneNum){
        return readerRepository.findReaderByPhoneNum(phoneNum);
    }
}
