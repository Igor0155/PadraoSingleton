package singleton;

public class ConfiguracaoBancoDados {

    // Construtor privado para evitar a instanciação externa
    private ConfiguracaoBancoDados() {
    };

    // Instância estática e única da própria classe
    private static ConfiguracaoBancoDados instance = new ConfiguracaoBancoDados();

    // Ponto de acesso global à instância
    public static ConfiguracaoBancoDados getInstance() {
        return instance;
    }

    private String urlConexao;
    private String usuarioBanco;

    public String getUrlConexao() {
        return urlConexao;
    }

    public void setUrlConexao(String urlConexao) {
        this.urlConexao = urlConexao;
    }

    public String getUsuarioBanco() {
        return usuarioBanco;
    }

    public void setUsuarioBanco(String usuarioBanco) {
        this.usuarioBanco = usuarioBanco;
    }
}