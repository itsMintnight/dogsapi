package dogsapi.dogs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogsService {
    @Autowired
    private DogsRepository dogsRepository;

    public List<Dogs> getAllDogs() {
        return dogsRepository.findAll();
    }

    public Dogs getDogByID(Long dogID) {
        return dogsRepository.findById(dogID).orElse(null);
    }

      public List<Dogs> getDogsByName(String name) {
        return dogsRepository.findDogsByName(name);
    }

    public List<Dogs> getDogsByBreed(String breed) {
        return dogsRepository.findDogsByBreed(breed);
    }

    public void deleteDogByID(Long ID) {
        dogsRepository.deleteById(ID);
    }

    public Dogs createDog(Dogs dog) {
        return dogsRepository.save(dog);
    }

    public Dogs updateDog(Long ID, Dogs dog) {
        return dogsRepository.save(dog);
    }

    public String findIntakeDate(Dogs dog) {
        return dogsRepository.findIntakeDate(dog.getDogID());
    }

    public String isMaleChecked(Dogs dog) {
        String sex = dogsRepository.findSex(dog.getDogID());

        if (sex.compareTo("Male") == 0) {
            return "checked";
        } else {
            return "";
        }
    }

    public String isFemaleChecked(Dogs dog) {
        String sex = dogsRepository.findSex(dog.getDogID());

        if (sex.compareTo("Female") == 0) {
            return "checked";
        } else {
            return "";
        }
    }
}
