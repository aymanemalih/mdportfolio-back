package com.example.mdportfolio.dao;

import com.example.mdportfolio.bean.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillDao extends JpaRepository<Skill, Long> {
}
