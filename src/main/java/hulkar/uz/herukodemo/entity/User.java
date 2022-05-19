package hulkar.uz.herukodemo.entity;

import jdk.jfr.DataAmount;
import lombok.*;

import javax.persistence.*;

/**
 * @author Hulkar,
 * @time чт 11:46.
 * @project 19.05.2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "apps")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String  name;

    private String  phoneNumber;

    private String password;
}
