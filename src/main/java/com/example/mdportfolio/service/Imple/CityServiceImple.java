package com.example.mdportfolio.service.Imple;

import com.example.mdportfolio.bean.City;
import com.example.mdportfolio.dao.CityDao;
import com.example.mdportfolio.service.facade.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImple implements CityService {
    @Autowired
    private CityDao cityDao;


    @Override
    public List<City> findByCountryCode(String code) {
        return this.cityDao.findByCountryCode(code);
    }
}
