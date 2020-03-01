package library.repository;

import library.entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository extends JpaRepository<Librarian,Long> {
    Librarian findLibrarianByLibrarianName(String librarianName);
    boolean existsByLibrarianName(String librarianName);
}
