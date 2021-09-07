package componentes;

import javax.swing.JTextField;

public class MeuJTextField extends JTextField implements MeuComponente {
    private String dica;
    private Boolean obrigatorio;

    public MeuJTextField(int tamanho, String dica, Boolean obrigatorio) {
        super(tamanho);

        this.dica = dica;
        this.obrigatorio = obrigatorio;
    }

    @Override
    public void limpar() {
        setText("");
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
}
