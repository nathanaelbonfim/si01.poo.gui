package componentes;

import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MeuJTextField extends JTextField implements MeuComponente, FocusListener {
    private String dica;
    private Boolean obrigatorio;

    public MeuJTextField(int tamanho, String dica, Boolean obrigatorio) {
        super(tamanho);

        this.dica = dica;
        this.obrigatorio = obrigatorio;

        this.addFocusListener(this);
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

    @Override
    public void focusGained(FocusEvent fe) {
        setBackground(Color.yellow);
    }

    @Override
    public void focusLost(FocusEvent fe) {
        if (eObrigatorio() && getText().equals("")) {
            setBackground(Color.red);
        } else {
            setBackground(Color.white);
        }
    }
}
