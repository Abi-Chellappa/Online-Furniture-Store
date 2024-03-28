package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.Entity.SignupEntity;
@Repository
public interface SignUpRepoInterface extends JpaRepository<SignupEntity, Integer> 
{
	 @Query(value="SELECT * FROM signupabi WHERE id=:id and firstname=:firstname",nativeQuery=true)
	    public List<SignupEntity> getAll(int id,String firstname);
}
