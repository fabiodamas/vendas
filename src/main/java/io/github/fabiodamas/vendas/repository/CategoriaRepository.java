package io.github.fabiodamas.vendas.repository;

import io.github.fabiodamas.vendas.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}