package com.example.mdportfolio.webservices;

import com.example.mdportfolio.bean.SkillCategory;
import com.example.mdportfolio.service.facade.SkillCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/skillcategory")
public class SkillCategoryARest {
    @Autowired
    private SkillCategoryService skillCategoryService;
}
