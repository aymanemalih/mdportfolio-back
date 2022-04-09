package com.example.mdportfolio.service.facade;

import com.example.mdportfolio.bean.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();

    Country save(Country country);

    int deleteByCode(String code);

    Country findByCode(String code);
}
