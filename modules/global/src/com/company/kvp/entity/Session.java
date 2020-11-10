package com.company.kvp.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "KVP_SESSION")
@Entity(name = "kvp_Session")
@NamePattern("%s|description")
public class Session extends StandardEntity {
    private static final long serialVersionUID = 976457831851420663L;

    @NotNull
    @MetaProperty(mandatory = true)
    @Transient
    private String topic;

    @Column(name = "START_DATE")
    private LocalDateTime startDate;


    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SPEAKER_ID")
    private Speaker speaker;

    @NotNull
    @Column(name = "DURATION", nullable = false)
    private Integer duration;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Transient
    @MetaProperty(related = {"startDate", "duration"})
    public LocalDateTime EndDate() {
        return (startDate != null && duration != null) ? startDate.plusHours(duration):null;
    }

    public LocalDateTime getEndDate() {
        return (startDate != null && duration != null) ? startDate.plusHours(duration):null;
    }

}