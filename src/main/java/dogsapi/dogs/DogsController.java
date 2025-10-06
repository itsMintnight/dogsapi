package dogsapi.dogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogsController {
    
    @Autowired
    private DogsService dogsService;

    @GetMapping("/dogs")
    public Object getAllDogs() {
        return dogsService.getAllDogs();
    }
}
