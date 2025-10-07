package dogsapi.dogs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogsController {
    
    @Autowired
    private DogsService dogsService;

    @GetMapping("/dogs")
    public List<Dogs> getAllDogs() {
        return dogsService.getAllDogs();
    }

    @PostMapping("/dogs")
    public Dogs createDog(@RequestBody Dogs dog) {
        return dogsService.createDog(dog);
    }

}
