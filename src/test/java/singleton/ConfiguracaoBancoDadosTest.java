package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import singleton.ConfiguracaoBancoDados;

class ConfiguracaoBancoDadosTest {

    @Test
    public void deveRetornarUrlConexao() {
        ConfiguracaoBancoDados.getInstance().setUrlConexao("jdbc:postgresql://localhost:5432/meu_sistema");
        assertEquals("jdbc:postgresql://localhost:5432/meu_sistema",
                ConfiguracaoBancoDados.getInstance().getUrlConexao());
    }

    @Test
    public void deveRetornarUsuarioBanco() {
        ConfiguracaoBancoDados.getInstance().setUsuarioBanco("admin_producao");
        assertEquals("admin_producao", ConfiguracaoBancoDados.getInstance().getUsuarioBanco());
    }

}