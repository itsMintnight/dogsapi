package dogsapi.dogs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 
public interface DogsRepository extends JpaRepository<Dogs, Long> {  

    @Query(value = "select * from dogs d where d.breed like %?1% ", nativeQuery = true)  
    public List<Dogs> findDogsByBreed(String breed);

    @Query(value = "select * from dogs d where d.name like %?1% ", nativeQuery = true)  
    public List<Dogs> findDogsByName(String name);
}   