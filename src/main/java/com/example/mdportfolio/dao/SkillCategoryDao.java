package com.example.mdportfolio.dao;

import com.example.mdportfolio.bean.SkillCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCategoryDao extends JpaRepository<SkillCategory, Long> {
}
