package Ocp;

public class Arquivo {

    private String conteudo;
    private Version dispositivo;

    public Arquivo(String nomeDispositivo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Ocp.refatorado." + nomeDispositivo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            this.dispositivo = null;
        }
        if (!(objeto instanceof Version)) {
            this.dispositivo = null;
        }
        this.dispositivo = (Version) objeto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        this.dispositivo.imprimir(conteudo);
    }
}
