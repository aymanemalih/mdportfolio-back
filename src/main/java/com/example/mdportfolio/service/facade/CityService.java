package com.example.mdportfolio.service.facade;

import com.example.mdportfolio.bean.City;

import java.util.List;

public interface CityService {
    List<City> findByCountryCode(String code);
    List<City> findAll();
    City save(City city);
    int deleteByCode(String code);
}