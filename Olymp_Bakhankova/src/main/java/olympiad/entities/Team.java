package olympiad.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    // Геттеры и сеттеры
}
