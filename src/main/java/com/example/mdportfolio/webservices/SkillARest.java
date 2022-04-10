package com.example.mdportfolio.webservices;


import com.example.mdportfolio.service.facade.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/skill")
public class SkillARest {
    @Autowired
    private SkillService skillService;


}
