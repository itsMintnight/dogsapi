package dogsapi.dogs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogsController {
    @Autowired
    private DogsService dogsService;

    /*
     * Get Mappings
     */
    @GetMapping("/dogs")
    public List<Dogs> getAllDogs() {
        return dogsService.getAllDogs();
    }

    @GetMapping("/dogs/{dogID}")
    public Dogs getDogByID(@PathVariable Long dogID) {
        return dogsService.getDogByID(dogID);
    }

    @GetMapping("/dogs/breed/{breed}") 
    public List<Dogs> getDogsByBreed(@PathVariable String breed) {
        return dogsService.getDogsByBreed(breed);
    }

    @GetMapping("/dogs/search")
    public List<Dogs> getDogsByName(@RequestParam String name) {
        return dogsService.getDogsByName(name);
    }

    /*
     * Post Mappings
     */
    @PostMapping("/dogs")
    public Dogs createDog(@RequestBody Dogs dog) {
        return dogsService.createDog(dog);
    }

    /*
     * Put Mappings
     */
    @PutMapping("/dogs/{ID}")
    public Dogs updateDog(@PathVariable Long ID, @RequestBody Dogs dog) {
        dogsService.updateDog(ID, dog);
        return dogsService.getDogByID(ID);
    }


    /*
     * Delete Mappings
     */
    @DeleteMapping("/dogs/{ID}")
    public void deleteDogByID(@PathVariable Long ID) {
        dogsService.deleteDogByID(ID);
    }

}
