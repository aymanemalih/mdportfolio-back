package com.example.mdportfolio.service.Imple;

import com.example.mdportfolio.bean.City;
import com.example.mdportfolio.bean.Country;
import com.example.mdportfolio.dao.CityDao;
import com.example.mdportfolio.service.facade.CityService;
import com.example.mdportfolio.service.facade.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImple implements CityService {
    @Autowired
    private CityDao cityDao;

    @Autowired
    private CountryService countryService;


    @Override
    public List<City> findByCountryCode(String code) {
        return this.cityDao.findByCountryCode(code);
    }

    @Override
    public List<City> findAll() {
        return this.cityDao.findAll();
    }

    @Override
    public City save(City city) {
        if (city.getCode().isEmpty() || city.getLibelle().isEmpty()) {
            return null;
        } else {
            if (cityDao.findByCode(city.getCode()) == null) {
                Country country = countryService.findByCode(city.getCountry().getCode());
                if (country == null) {
                    return null;
                }
                city.setCountry(country);
                return cityDao.save(city);
            } else {
                return null;
            }
        }
    }

    @Override
    public int deleteByCode(String code) {
        return cityDao.deleteByCode(code);
    }


}
