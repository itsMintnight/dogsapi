package dogsapi.dogs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DogsService {
    @Autowired
    private DogsRepository dogsRepository;

    /*
     * Get Mappings
     */
    public List<Dogs> getAllDogs() {
        return dogsRepository.findAll();
    }

    public Dogs getDogByID(Long dogID) {
        return dogsRepository.findById(dogID).orElse(null);
    }

    public List<Dogs> getDogsByBreed(String breed) {
        return dogsRepository.findDogsByBreed(breed);
    }

    public List<Dogs> getDogsByName(String name) {
        return dogsRepository.findDogsByName(name);
    }

    /*
     * Post Mappings
     */

    public Dogs createDog(Dogs dog) {
        return dogsRepository.save(dog);
    }

    /*
     * Put Mappings
     */
    public Dogs updateDog(Long ID, Dogs dog) {
        return dogsRepository.save(dog);
    }

    
    /*
     * Delete Mappings
     */
    public void deleteDogByID(Long ID) {
        dogsRepository.deleteById(ID);
    }
}
