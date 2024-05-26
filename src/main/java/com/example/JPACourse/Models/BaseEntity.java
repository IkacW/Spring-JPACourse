package com.example.JPACourse.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue
    private Integer id;

    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    private LocalDateTime createdBy;
    private LocalDateTime lastModifiedBy;
}

