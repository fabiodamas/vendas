package io.github.fabiodamas.vendas.repository;

import io.github.fabiodamas.vendas.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}