package com.example.mdportfolio.dao;

import com.example.mdportfolio.bean.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityDao extends JpaRepository<City, Long> {
    List<City> findByCountryCode(String code);
}
