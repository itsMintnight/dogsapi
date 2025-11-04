package dogsapi.dogs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DogsController {
    @Autowired
    private DogsService dogsService;

    /*
     * Get Mappings
     */
    @GetMapping("/dogs")
    public String getAllDogs(Model model) {
        // return dogsService.getAllDogs();
        model.addAttribute("allDogs", dogsService.getAllDogs());
        return "dogs-list";
    }

    @GetMapping("/dogs/search")
    public String getDogsByName (Model model, @RequestParam String name) {
        model.addAttribute("dogsByName", dogsService.getDogsByName(name));
        return "dogs-search";
    }

    @GetMapping("/dogs/{dogID}")
    public String getDogByID(Model model, @PathVariable Long dogID) {
        // return dogsService.getDogByID(dogID);
        model.addAttribute("dog", dogsService.getDogByID(dogID));
        return "dogs-details";
    }

    @GetMapping("/dogs/createForm")
    public String showCreateForm(Model model) {
        Dogs dog = new Dogs();
        model.addAttribute(dog);
        return "dogs-create";
    }

    @PostMapping("/dogs")
    public String createDog(Dogs dog) {
        dogsService.createDog(dog);
        Long dogID = dog.getDogID();
        return "redirect:/dogs/" + dogID;
    }

    @GetMapping("/dogs/updateForm/{dogID}")
    public String showUpdateForm(Model model, @PathVariable Long dogID) {
        Dogs dog = dogsService.getDogByID(dogID);
        model.addAttribute("dog", dog);
        return "dogs-update";
    }

    @PostMapping("/dogs/updateForm/{dogID}")
    public String updateDog(Dogs dog, @PathVariable Long dogID) {
        dogsService.updateDog(dogID, dog);
        return "redirect:/dogs/" + dogID;
    }

    @GetMapping("/dogs/delete/{ID}")
    public String deleteDogByID(@PathVariable Long ID) {
        dogsService.deleteDogByID(ID);
        return "redirect:/dogs";
    }

    @GetMapping("/dogs/breed/{breed}") 
    public List<Dogs> getDogsByBreed(@PathVariable String breed) {
        return dogsService.getDogsByBreed(breed);
    }
}
