package dogsapi.dogs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
 
public interface DogsRepository extends JpaRepository<Dogs, Long> {  

    @Query(value = "select * from dogs d where d.breed like %?1% ", nativeQuery = true)  
    public List<Dogs> findDogsByBreed(String breed);

    @Query(value = "select * from dogs d where d.name like %:name% ", nativeQuery = true)  
    public List<Dogs> findDogsByName(@Param("name") String name);
}   