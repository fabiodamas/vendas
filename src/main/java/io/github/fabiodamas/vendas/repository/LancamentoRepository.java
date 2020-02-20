package io.github.fabiodamas.vendas.repository;

import io.github.fabiodamas.vendas.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}