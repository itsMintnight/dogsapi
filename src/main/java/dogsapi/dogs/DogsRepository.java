package dogsapi.dogs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 
public interface DogsRepository extends JpaRepository<Dogs, Long> {  

    @Query(value = "select * from dogs where breed like %?1% ", nativeQuery = true)  
    public List<Dogs> findDogsByBreed(String breed);

    @Query(value = "select * from dogs where name like %?1% ", nativeQuery = true)  
    public List<Dogs> findDogsByName(String name);

    @Query(value = "select intake_date from dogs where dogid = ?1", nativeQuery = true)
    public String findIntakeDate(Long dogid);
}   