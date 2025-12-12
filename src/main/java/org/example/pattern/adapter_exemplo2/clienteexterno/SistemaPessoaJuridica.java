package org.example.pattern.adapter_exemplo2.clienteexterno;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SistemaPessoaJuridica {

    public void registrarCNPJ(String nome, String cnpj) {
        log.info("Registrando PJ: {} - CNPJ: {}", nome, cnpj);
    }

}
