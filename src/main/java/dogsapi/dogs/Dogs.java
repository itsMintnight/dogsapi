package dogsapi.dogs;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
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
    private Date intakeDate;
    private String image;
    private String description;
}