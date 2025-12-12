package org.example.pattern.adapter_exemplo2.clienteexterno;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SistemaPessoaFisica {

    public void registrarCPF(String nome, String cpf) {
        log.info("Registrando PF: {} - CPF: {}", nome, cpf);
    }

}
