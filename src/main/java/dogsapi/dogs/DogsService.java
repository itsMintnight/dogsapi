package dogsapi.dogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogsService {
    @Autowired
    private DogsRepository dogsRepository;

    public Object getAllDogs () {
        return dogsRepository.getAllDogs();
    }



}
