package olympiad.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Sportsman")
public class Sportsman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "Team_id", nullable = false)
    private Team team;

    // Геттеры и сеттеры
}
