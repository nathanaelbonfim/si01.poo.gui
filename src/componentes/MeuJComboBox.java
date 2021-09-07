package componentes;

import javax.swing.JComboBox;

public class MeuJComboBox extends JComboBox implements MeuComponente {
    public MeuJComboBox(String[] dados) {
        for (String dado : dados) {
            addItem(dado);
        }
    }

    @Override
    public void limpar() {
        setSelectedIndex(-1);
    }

    public void habilitar(Boolean status) {
        setEnabled(status);
    }
}
