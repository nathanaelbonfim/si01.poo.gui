package componentes;

import javax.swing.JComboBox;

public class MeuJComboBox extends JComboBox implements MeuComponente {
    private String dica;
    private Boolean obrigatorio;

    public MeuJComboBox(String[] dados, String dica, Boolean obrigatorio) {
        this.dica = dica;
        this.obrigatorio = obrigatorio;

        for (String dado : dados) {
            addItem(dado);
        }
    }

    @Override
    public void limpar() {
        setSelectedIndex(-1);
    }

    @Override
    public void habilitar(Boolean status) {
        setEnabled(status);
    }

    @Override
    public String getDica() {
        return dica;
    }


    @Override
    public Boolean eObrigatorio() {
        return obrigatorio;
    }

    @Override
    public Boolean eValido() {
        return false;
    }
}
