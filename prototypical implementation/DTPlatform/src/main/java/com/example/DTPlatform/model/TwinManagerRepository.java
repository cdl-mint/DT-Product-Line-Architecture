package com.example.DTPlatform.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TwinManagerRepository extends JpaRepository<TwinManager, String>{

    public List<TwinManager> findAll();

}
