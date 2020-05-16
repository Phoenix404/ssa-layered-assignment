package com.comp.persistence;

import com.comp.domain.Covid;

import java.util.List;

@org.springframework.stereotype.Service
public class CovidDataService {


    private CovidRepository covidRepository;

    public CovidDataService(CovidRepository covidRepository) {
        this.covidRepository = covidRepository;
    }

    public List<Covid> getList() {
        return covidRepository.findByLocation("italy");
    }


}
