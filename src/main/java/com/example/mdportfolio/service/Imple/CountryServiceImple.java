package com.example.mdportfolio.service.Imple;


import com.example.mdportfolio.bean.Country;
import com.example.mdportfolio.dao.CountryDao;
import com.example.mdportfolio.service.facade.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryServiceImple implements CountryService {

    @Autowired
    private CountryDao countryDao;

    @Override
    public List<Country> findAll() {
        return this.countryDao.findAll();
    }

    @Override
    public Country save(Country country) {

        if (country.getCode().isEmpty() || country.getLibelle().isEmpty()) {
            return null;
        } else {
            if (countryDao.findByCode(country.getCode()) == null) {
                return countryDao.save(country);
            } else {
                return null;
            }
        }
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return countryDao.deleteByCode(code);
    }
}