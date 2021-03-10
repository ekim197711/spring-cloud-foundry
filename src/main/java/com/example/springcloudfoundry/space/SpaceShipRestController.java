package com.example.springcloudfoundry.space;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SpaceShipRestController {
    private final SpaceShipRepository repository;

    @GetMapping("/ships")
    public List<SpaceShip> ships(){
        return repository.findAll();
    }

    @PostMapping("/ship")
    public List<SpaceShip> shipCreate(@RequestBody SpaceShip ship){
        ship.setId(null);
        repository.save(ship);
//        repository.
        return repository.findAll();
    }

    @DeleteMapping("/ships")
    public List<SpaceShip> shipDeleteAll(){
        repository.deleteAll();
        return repository.findAll();
    }
}
