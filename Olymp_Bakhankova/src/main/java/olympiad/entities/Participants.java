package olympiad.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Participants")
public class Participants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "Event_event_id", nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "Sportsman_id", nullable = false)
    private Sportsman sportsman;

    @Column(name = "medal", nullable = false)
    private int medal;

    // Геттеры и сеттеры
}
