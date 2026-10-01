package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenteNegocioTest {

    @BeforeEach
    void setUp() {
        // Configura o Singleton antes de cada teste
        Dados.getInstance().setCodCoop("4402");
        Dados.getInstance().setNumPA("05");
    }

    @Test
    void deveProcessarAtendimentoPessoaFisica() {
        FabricaAbstrata fabricaPF = new FabricaPF();
        ProcessadorNotificacao processadorPF = new ProcessadorNotificacaoPF();

        GerenteNegocio gerente = new GerenteNegocio(fabricaPF, processadorPF);
        String resultado = gerente.realizarAtendimento("João Silva");

        String resultadoEsperado = "Contrato PF [Coop: 4402 | PA: 05] | " +
                "Relatório de Análise de Risco PF | " +
                "Notificação PF: Empréstimo aprovado para o cooperado João Silva";

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void deveProcessarAtendimentoAgro() {
        FabricaAbstrata fabricaAgro = new FabricaAgro();
        ProcessadorNotificacao processadorAgro = new ProcessadorNotificacaoAgro();

        GerenteNegocio gerente = new GerenteNegocio(fabricaAgro, processadorAgro);
        String resultado = gerente.realizarAtendimento("Fazenda Boa Vista");

        String resultadoEsperado = "Cédula de Crédito Rural Agro [Coop: 4402 | PA: 05] | " +
                "Relatório de Vistoria de Safra e Penhor | " +
                "Notificação Agro: Crédito Rural liberado para a propriedade de Fazenda Boa Vista";

        assertEquals(resultadoEsperado, resultado);
    }
}