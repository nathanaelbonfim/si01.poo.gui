package componentes;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MeuJFormattedTextField extends JFormattedTextField implements MeuComponente, FocusListener {
    private String dica;
    private Boolean obrigatorio;

    public MeuJFormattedTextField(int tamanho, String formato, String dica, Boolean obrigatorio) {

        try {
            MaskFormatter mf = new MaskFormatter(formato);
            mf.install(this);
            setColumns(tamanho);
            this.dica = dica;
            this.obrigatorio = obrigatorio;
        } catch (Exception e) {
            e.printStackTrace();
        }

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
        setCaretPosition(0);
    }

    @Override
    public void focusLost(FocusEvent fe) {
        if (eObrigatorio() && getText().equals("") || (!eValido())) {
            setBackground(Color.red);
        } else {
            setBackground(Color.white);
        }
    }

    @Override
    public Boolean eValido() {
        return true;
    }
}
