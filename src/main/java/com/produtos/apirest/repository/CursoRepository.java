package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
