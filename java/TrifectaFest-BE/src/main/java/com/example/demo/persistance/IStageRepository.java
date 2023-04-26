package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entiteien.Stage;

@Component
public interface IStageRepository  extends JpaRepository<Stage , Long >{

}
