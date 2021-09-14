package componentes;

public class MeuCampoCEP extends MeuJFormattedTextField {
    public MeuCampoCEP(String dica, Boolean obrigatorio) {
        super(6, "#####-###", dica, obrigatorio);
    }

    public Boolean eValido() {
        String conteudo = getText();
        String conteudoSemTraco = conteudo.replace("-", "");
        String conteudoSemEspacos = conteudoSemTraco.trim();

        int tamanhoCampo = conteudoSemEspacos.length();

        if (tamanhoCampo == 8) {
            return true;
        } else {
            return false;
        }
    }
}
