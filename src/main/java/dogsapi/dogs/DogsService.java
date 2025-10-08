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

    public Dogs getDogByID(Long ID) {
        return dogsRepository.findById(ID).orElse(null);
    }

    public List<Dogs> getDogsByBreed(String breed) {
        return dogsRepository.findByString(breed);
    }

    public Dogs createDog(Dogs dog) {
        return dogsRepository.save(dog);
    }

    public List<Dogs> getDogsByName(String name) {
        return dogsRepository.findByName(name);
    }
}
