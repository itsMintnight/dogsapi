package dogsapi.dogs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface DogsRepository extends JpaRepository<Dogs, String> {
    @Query(value = "select * from dogs" , nativeQuery = true)
    List<Dogs> getAllDogs();

    @Query(value = "select * from dogs d where d.name like %?1% ", nativeQuery = true)
    List<Dogs> getDogsByName(String name);

    
}