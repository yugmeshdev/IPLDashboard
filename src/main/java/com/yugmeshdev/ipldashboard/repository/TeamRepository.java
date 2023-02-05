package com.yugmeshdev.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.yugmeshdev.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team,Long>{
    Team findByTeamName(String teamName);
    
}
