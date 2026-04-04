package singleton;

public class ConfiguracaoBancoDados {

    private ConfiguracaoBancoDados() {
    };

    private static ConfiguracaoBancoDados instance = new ConfiguracaoBancoDados();

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
