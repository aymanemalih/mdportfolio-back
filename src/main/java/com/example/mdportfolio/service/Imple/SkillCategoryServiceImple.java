package com.example.mdportfolio.service.Imple;

import com.example.mdportfolio.dao.SkillCategoryDao;
import com.example.mdportfolio.service.facade.SkillCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillCategoryServiceImple implements SkillCategoryService {
    @Autowired
    private SkillCategoryDao skillCategoryDao;


}
