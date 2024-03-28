package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.PersonEntity;
@Repository
public interface PersonRepoInterface extends JpaRepository<PersonEntity, Integer> 
{

}
