package olympiad.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TeamEventParticipants")
public class TeamEventParticipants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "Team_id", nullable = false)
    private Team team;

    @ManyToOne
    @JoinColumn(name = "Event_event_id", nullable = false)
    private Event event;

    @Column(name = "medal", nullable = false)
    private int medal;

    // Геттеры и сеттеры
}
