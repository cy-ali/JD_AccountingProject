package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@AllArgsConstructor
public abstract class BaseEntity {

    @Id
    Long id;

    @NotNull
    private LocalDateTime insertDateTime;

    @NotNull
    private Long insertUserId;

    @NotNull
    LocalDateTime lastUpdateDateTime;

    @NotNull
    Long lastUpdateUserId;

    boolean isDeleted;


    public void setId(Long id) {
        this.id = id;
    }

    public void setLastUpdateDateTime(LocalDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public void setLastUpdateUserId(Long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}