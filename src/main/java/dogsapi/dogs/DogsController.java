package dogsapi.dogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogsController {
    
    @Autowired
    private DogsService dogsService;

    @GetMapping("/dogs")
    public void getAllDogs() {
        dogsService.getAllDogs();
    }

    @GetMapping("/test")
    public void print() {
        System.out.println("Hello World!");
    }

    @PostMapping("/make")
    public void makeDog() {
        dogsService.makeDog();
    }
}
