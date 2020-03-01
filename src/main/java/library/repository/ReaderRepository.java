package library.repository;

import library.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader,Long> {
    Reader findReaderByPhoneNum(String phoneNum);
}
