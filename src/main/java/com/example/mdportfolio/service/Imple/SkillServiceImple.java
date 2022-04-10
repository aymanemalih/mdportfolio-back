package com.example.mdportfolio.service.Imple;

import com.example.mdportfolio.dao.SkillDao;
import com.example.mdportfolio.service.facade.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImple implements SkillService {
    @Autowired
    private SkillDao skillDao;
}
