package telas;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class TelaCadastroEstado extends TelaCadastro {
    private JTextField jtfCodigo = new JTextField(10);
    private JTextField jtfNome = new JTextField(20);
    private JTextField jtfSigla = new JTextField(2);

    private JLabel jlCodigo = new JLabel("Código");
    private JLabel jlNome = new JLabel("Nome");
    private JLabel jlSigla = new JLabel("Sigla");

    
    public TelaCadastroEstado() {
        super("Cadastro de Estado");
        jpComponentes.setLayout(new GridBagLayout());

        montaTela();
        pack();
    }
    
    public void montaTela() {
        adicionaComponente(1, 1, 1, 1, jlCodigo, jtfCodigo);
        adicionaComponente(3, 1, 1, 2, jlNome, jtfNome);
        adicionaComponente(5, 1, 1, 1, jlSigla, jtfSigla);
    }
}
