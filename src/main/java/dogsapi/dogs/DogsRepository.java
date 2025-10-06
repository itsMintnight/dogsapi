package dogsapi.dogs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface DogsRepository extends JpaRepository<Dogs, Long> {
    @Query(value = "select * from Dogs" , nativeQuery = true)
    List<Dogs> getAllDogs();
    
    @Query(value = "insert into dogs (dogId, name) values (1, 'Tim')", nativeQuery = true)
    void makeDog();
}