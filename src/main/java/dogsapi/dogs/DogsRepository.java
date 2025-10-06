package dogsapi.dogs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DogsRepository extends JpaRepository<Dogs, Long> {
    @Query(value = "select * from dogs" , nativeQuery = true)
    List<Dogs> getAllDogs();
    
}