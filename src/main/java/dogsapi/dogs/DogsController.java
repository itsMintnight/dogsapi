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
            * Endpoints for getting and deleting
            */

    /**
     * Endpoint to get all dogs
     * 
     * @return List of all dogs
     */
    @GetMapping("/dogs")
    public String getAllDogs(Model model) {
        model.addAttribute("allDogs", dogsService.getAllDogs());
        return "dogs-list";
    }

    /**
     * Endpoint to get a dog by its ID
     * 
     * @param dogID The dog's ID
     * @return The dog that has the ID
     */
    @GetMapping("/dogs/{dogID}")
    public String getDogByID(Model model, @PathVariable Long dogID) {
        model.addAttribute("dog", dogsService.getDogByID(dogID));
        return "dogs-details";
    }

    /**
     * Endpoint to search for a dog
     * 
     * @param name The name of the dog
     * @return The dogs that that have that name
     */
    @GetMapping("/dogs/search")
    public String getDogsByName (Model model, @RequestParam String name) {
        model.addAttribute("dogsByName", dogsService.getDogsByName(name));
        return "dogs-search";
    }

    /**
     * Endpoint to get a list of dogs by breed
     * 
     * @param breed The breed to search for
     * @return A list of dogs
     */
    @GetMapping("/dogs/breed/{breed}") 
    public List<Dogs> getDogsByBreed(@PathVariable String breed) {
        return dogsService.getDogsByBreed(breed);
    }

    /**
     * Endpoint to delete a dog
     * 
     * @param ID The id of the dog to delete
     * @return The dog homepage
     */
    @GetMapping("/dogs/delete/{ID}")
    public String deleteDogByID(@PathVariable Long ID) {
        dogsService.deleteDogByID(ID);
        return "redirect:/dogs";
    }

    

            /*
            * Endpoints for forms
            */

    /**
     * Endpoint to show the form to add a dog
     * 
     * @return The view for the form
     */
    @GetMapping("/dogs/createForm")
    public String showCreateForm(Model model) {
        Dogs dog = new Dogs();
        model.addAttribute(dog);
        return "dogs-create";
    }

    /**
     * Endpoint to add a new dog
     * 
     * @param dog The dog to add 
     * @return The dog's detail page
     */
    @PostMapping("/dogs")
    public String createDog(Dogs dog) {
        dogsService.createDog(dog);
        Long dogID = dog.getDogID();
        return "redirect:/dogs/" + dogID;
    }

    /**
     * Endpoint to show the update form 
     * 
     * @param dogID The ID of the dog 
     * @return The view for the form
     */
    @GetMapping("/dogs/updateForm/{dogID}")
    public String showUpdateForm(Model model, @PathVariable Long dogID) {
        Dogs dog = dogsService.getDogByID(dogID);
        model.addAttribute("dog", dog);
        model.addAttribute("intakeDate", dogsService.findIntakeDate(dog));
        model.addAttribute("isMaleChecked", dogsService.isMaleChecked(dog));
        model.addAttribute("isFemaleChecked", dogsService.isFemaleChecked(dog));
        return "dogs-update";
    }

    /**
     * Endpoint to update the dog
     * 
     * @param dog The dog to update
     * @param dogID The dog's ID 
     * @return The dog's detail page
     */
    @PostMapping("/dogs/updateForm/{dogID}")
    public String updateDog(Dogs dog, @PathVariable Long dogID) {
        dogsService.updateDog(dogID, dog);
        return "redirect:/dogs/" + dogID;
    }
}
