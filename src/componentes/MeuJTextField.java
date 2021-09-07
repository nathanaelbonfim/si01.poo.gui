package componentes;

import javax.swing.JTextField;

public class MeuJTextField extends JTextField implements MeuComponente {
    private String dica;

    public MeuJTextField(int tamanho, String dica) {
        super(tamanho);

        this.dica = dica;
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
}
