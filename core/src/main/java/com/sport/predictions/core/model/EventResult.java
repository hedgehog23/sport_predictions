package com.sport.predictions.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.time.OffsetDateTime;

/**
 * @author sergeylapko
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "event")
public class EventResult {
    @Id
    @Column(name = "event_id")
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(name = "home_team_score", nullable = false)
    private Integer homeTeamScore;

    @Column(name = "away_team_score", nullable = false)
    private Integer awayTeamScore;

    @Column(name = "creation_time", nullable = false, updatable = false)
    private OffsetDateTime creationTime;

    @PrePersist
    public void prePersist() {
        creationTime = OffsetDateTime.now();
    }
}
