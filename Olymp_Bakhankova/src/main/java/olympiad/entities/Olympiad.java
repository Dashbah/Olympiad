package olympiad.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "Olympiad")
public class Olympiad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "season", nullable = false)
    private String season;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "city", nullable = false)
    private String city;

    // Геттеры и сеттеры
}
