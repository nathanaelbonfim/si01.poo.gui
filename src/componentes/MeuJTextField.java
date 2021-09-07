package componentes;

import javax.swing.JTextField;

public class MeuJTextField extends JTextField implements MeuComponente {
    public MeuJTextField(int tamanho) {
        super(tamanho);
    }

    @Override
    public void limpar() {
        setText("");
    }

    public void habilitar(Boolean status) {
        setEnabled(status);
    }
}
