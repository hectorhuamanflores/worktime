package com.bcp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcp.demo.model.Usuario;



@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

}
