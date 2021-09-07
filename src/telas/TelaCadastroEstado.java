package telas;

import javax.swing.JLabel;
import javax.swing.JTextField;

import componentes.MeuJTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class TelaCadastroEstado extends TelaCadastro {
    private MeuJTextField jtfCodigo = new MeuJTextField(10);
    private MeuJTextField jtfNome = new MeuJTextField(20);
    private MeuJTextField jtfSigla = new MeuJTextField(2);

    
    public TelaCadastroEstado() {
        super("Cadastro de Estado");

        montaTela();
        pack();
    }
    
    public void montaTela() {
        adicionaComponente(1, 1, 1, 1, "Código", jtfCodigo);
        adicionaComponente(3, 1, 1, 2, "Nome", jtfNome);
        adicionaComponente(5, 1, 1, 1, "Sigla", jtfSigla);

        habilitaComponentes(false);
    }
}
