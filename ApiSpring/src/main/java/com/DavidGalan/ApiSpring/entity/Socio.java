package com.eviden.pablo.api.clubNautico.Club.Nautico.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Socio {
    @Autowired
    @Id
    private String dni;
    private String name;
    private String lastname;

}
