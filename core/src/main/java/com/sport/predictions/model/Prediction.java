package com.sport.predictions.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.time.OffsetDateTime;

/**
 * Player prediction about event's score
 *
 * @author sergeylapko
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "prediction")
public class Prediction {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_player_id", nullable = false)
    private UserPlayer userPlayer;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @Column(name = "home_team_score", nullable = false)
    private Integer homeScore;

    @Column(name = "away_team_score", nullable = false)
    private Integer awayScore;

    @Column(name = "creation_time", nullable = false, updatable = false)
    private OffsetDateTime creationTime;

    @PrePersist
    public void prePersist() {
        creationTime = OffsetDateTime.now();
    }
}
