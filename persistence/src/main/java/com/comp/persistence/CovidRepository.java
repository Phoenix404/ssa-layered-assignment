package com.comp.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.comp.domain.Covid;

import java.sql.Date;
import java.util.List;

@Repository
public interface CovidRepository extends JpaRepository<Covid, Integer> {

    List<Covid> fetchAllData();

    List<Covid> findByDate(Date date);

    List<Covid> findByLocation(String location);

}
