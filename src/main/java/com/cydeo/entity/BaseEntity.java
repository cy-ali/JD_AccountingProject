package com.cydeo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(BaseEntityListener.class)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false,updatable = false)
    private LocalDateTime insertDateTime;

    @Column(nullable = false,updatable = false)
    private Long insertUserId;

    @Column(nullable = false)
    LocalDateTime lastUpdateDateTime;

    @Column(nullable = false)
    Long lastUpdateUserId;

    boolean isDeleted = false;
}
