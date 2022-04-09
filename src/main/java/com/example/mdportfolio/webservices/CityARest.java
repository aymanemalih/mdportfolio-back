package com.example.mdportfolio.webservices;

import com.example.mdportfolio.bean.City;
import com.example.mdportfolio.service.facade.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/city")
public class CityARest{
    @Autowired
    private CityService cityService;

    @GetMapping(value = "countrycode/{code}")
    public List<City> findByCountryCode(@PathVariable String code) {
        return cityService.findByCountryCode(code);
    }
}
