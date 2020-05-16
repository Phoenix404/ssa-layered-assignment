package com.comp.rest;

import com.comp.persistence.CovidDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.comp.domain.Covid;

import java.util.List;

@RestController
public class CovidController {

    // @Autowired
    private CovidDataService covidDataService;

    public CovidController(CovidDataService cr) {
        covidDataService = cr;
    }

    @GetMapping("/cdata")
    public List<Covid>  getList() {
        return this.covidDataService.getList();
    }
}
