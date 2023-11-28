package olympiad.entities;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private int eventId;

    @Column(name = "sport_type", nullable = false)
    private String sportType;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "place", nullable = false)
    private String place;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "time", nullable = false)
    private Time time;

    @ManyToOne
    @JoinColumn(name = "Olympiad_id", nullable = false)
    private Olympiad olympiad;

    // Геттеры и сеттеры
}
