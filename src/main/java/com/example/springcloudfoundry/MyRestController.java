package com.example.springcloudfoundry;

import com.example.springcloudfoundry.space.SpaceShip;
import com.example.springcloudfoundry.space.SpaceShipRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class MyRestController {
    @Value("${mygreeting}")
    String mygreeting;

    @GetMapping("/soda")
    public String greeting(){
        log.info("Return {}", mygreeting);
        return mygreeting;
    }

    @GetMapping("/eathealthy")
    public String healthy(){
        log.info("Return Vegestables are your friends");
        return "Vegestables are your friends";
    }

}
