package dogsapi.dogs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Dogs")
public class Dogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dogID;
    private String name;
    private String breed;
    private String sex;
    private double weight;
    private int age;
    private String location;
    private String intakeDate;
    private String image;
    private String description;
    
    /*
     * Constructors
     */
    public Dogs() {
    }

    public Dogs(String name, String breed, String sex, double weight, int age, String location, String intakeDate, String image, String description) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.weight = weight;
        this.age = age;
        this.location = location;
        this.intakeDate = intakeDate;
        this.image = image;
        this.description = description;
    }

    /*
     * Getters
     */
    public Long getdogID() {
        return dogID;
    }

    public String getName() {
        return name;
    
    }

    public String getSex() {
        return sex;

    }
    public double getWeight() {
        return weight;

    }

    public int getAge() {
        return age;

    }

    public String getLocation() {
        return location;

    }

    public String getIntakeDate() {
        return intakeDate;

    }

    public String getImage() {
        return image;

    }

    public String getDescription() {
        return description;
    }

    /*
     * Setters
     */
    public void setdogID(Long input) {
        dogID = input;
    }

    public void setName(String input) {
        name = input;
    }

    public void setSex(String input) {
        sex = input;

    }
    public void setWeight(Double input) {
        weight = input;

    }

    public void setAge(int input) {
        age = input;

    }

    public void setLocation(String input) {
        location = input;

    }

    public void setIntakeDate(String input) {
        intakeDate = input;

    }

    public void setImage(String input) {
        image = input;

    }

    public void setDescription(String input) {
        description = input;
    }
}