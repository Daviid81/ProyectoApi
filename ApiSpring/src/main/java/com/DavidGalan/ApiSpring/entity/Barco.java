package com.eviden.pablo.api.clubNautico.Club.Nautico.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Barco")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Barco {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String matricula;
    private int socioId;
}
