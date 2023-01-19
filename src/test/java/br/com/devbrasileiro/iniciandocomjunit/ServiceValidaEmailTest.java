package br.com.devbrasileiro.iniciandocomjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceValidaEmailTest {

    @Test
    void verificandoUmEmailValido() {

        boolean emailValido = ServiceValidaEmail.validarEmail("testandojunit@devbrasileiro.com.br");

        Assertions.assertEquals(true, emailValido);
    }

    @Test
    void verificandoUmEmailInvalido() {

        boolean emailInvalido1 = ServiceValidaEmail.validarEmail("@devbrasileiro.com.br");
        boolean emailInvalido2 = ServiceValidaEmail.validarEmail("testandojunit@");
        boolean emailInvalido3 = ServiceValidaEmail.validarEmail("testandojunitdevbrasileiro.com.br");
        boolean emailInvalido4 = ServiceValidaEmail.validarEmail("devbrasileiro");

        Assertions.assertEquals(false, emailInvalido1);
        Assertions.assertEquals(false, emailInvalido2);
        Assertions.assertEquals(false, emailInvalido3);
        Assertions.assertEquals(false, emailInvalido4);
    }

}