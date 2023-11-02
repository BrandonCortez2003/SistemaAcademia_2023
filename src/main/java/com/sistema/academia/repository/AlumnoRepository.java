package com.sistema.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.academia.entities.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}