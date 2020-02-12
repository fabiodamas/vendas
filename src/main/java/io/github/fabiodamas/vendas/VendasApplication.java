package io.github.fabiodamas.vendas;

import io.github.fabiodamas.vendas.repository.PessoaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class VendasApplication  implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

    @Autowired
    public PessoaRepository pessoaRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO Auto-generated method stub


//		Endereco endereco = Endereco.builder().logradouro("rua x").numero("100").cep("17209440").cidade("Sao paulo").complemento("apt 111").build();
//		Pessoa adriana = Pessoa.builder().nome("adriana").endereco(endereco).build();
//
//		pessoaRepository.saveAndFlush(adriana);

        log.info("Iniciado!!!" );

		/*
		Pessoa fernando = new Cliente(ID_CLIENTE_FERNANDO, "Fernando Boaglio", "Sampa");

		fernando.novoPedido(pedido2DoFernando);
		clienteRepository.saveAndFlush(fernando);
		System.out.println(">>> Pedido 2 - Fernando : " + pedido2DoFernando);
		System.out.println(">>> Gravado cliente 1: " + fernando);
*/
    }

}
