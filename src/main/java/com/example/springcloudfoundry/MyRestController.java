package com.example.springcloudfoundry;

import com.example.springcloudfoundry.space.SpaceShip;
import com.example.springcloudfoundry.space.SpaceShipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MyRestController {
    @Value("${mygreeting}")
    String mygreeting;

    @GetMapping("/soda")
    public String greeting(){
        return mygreeting;
    }

}
