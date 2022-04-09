package com.example.mdportfolio.webservices;

import com.example.mdportfolio.bean.Country;
import com.example.mdportfolio.service.facade.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/country")
public class CountryARest {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public List<Country> findAll() {
        return countryService.findAll();
    }

    @PostMapping("/")
    public Country save(@RequestBody Country country) {
        return countryService.save(country);
    }

    @DeleteMapping("/{code}")
    public int deleteByCode(@PathVariable String code) {
        return countryService.deleteByCode(code);
    }
}
