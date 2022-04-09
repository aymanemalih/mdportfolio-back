package com.example.mdportfolio.webservices;

import com.example.mdportfolio.bean.City;
import com.example.mdportfolio.service.facade.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/city")
public class CityARest {
    @Autowired
    private CityService cityService;


    @GetMapping(value = "countrycode/{code}")
    public List<City> findByCountryCode(@PathVariable String code) {
        return cityService.findByCountryCode(code);
    }


    @GetMapping(value = "/")
    public List<City> findAll() {
        return cityService.findAll();
    }

    @PostMapping("/")
    public City save(@RequestBody City city) {
        return cityService.save(city);
    }

    @DeleteMapping("/{code}")
    public int deleteByCode(@PathVariable String code) {
        return cityService.deleteByCode(code);
    }
}
