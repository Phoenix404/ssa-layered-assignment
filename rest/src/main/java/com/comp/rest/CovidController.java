package com.comp.rest;

import com.comp.persistence.CovidRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.comp.domain.Covid;

import java.util.List;

@RestController
public class CovidController {

    private final CovidRepository covidRepository;

    public CovidController(CovidRepository cr) {
        covidRepository = cr;
    }

    @GetMapping("/cdata")
    public List<Covid>  getList() {
        return this.covidRepository.findByLocation("italy");
    }
}
