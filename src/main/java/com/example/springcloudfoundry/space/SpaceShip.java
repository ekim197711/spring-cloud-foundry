package com.example.springcloudfoundry.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    @Id
    private String id;
    private String model;
    private String captain;
    private int fuel;
}
