package dogsapi.dogs;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DogsService {
    @Autowired
    private DogsRepository dogsRepository;
    private static final String UPLOAD_DIR = "src/main/resources/static/images/";

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

    public Dogs createDog(Dogs dog, MultipartFile image) {
        Dogs newDog = dogsRepository.save(dog);
        String originalFileName = image.getOriginalFilename();

        try {
            if (originalFileName != null && originalFileName.contains(".")) {
                String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
                String fileName = String.valueOf(newDog.getDogID()) + "." + fileExtension;
                Path filePath = Paths.get(UPLOAD_DIR + fileName);

                InputStream inputStream = image.getInputStream();

                Files.createDirectories(Paths.get(UPLOAD_DIR));
                Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
                newDog.setImage(fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dogsRepository.save(newDog);
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
