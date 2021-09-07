package telas;

import javax.swing.JTextField;

public class TelaCadastroCidade extends TelaCadastro {
    private JTextField jtfNome   = new JTextField(20);
    private JTextField jtfCodigo = new JTextField(10);
    private JTextField jtfEstado  = new JTextField(20);

    public TelaCadastroCidade() {
        super("Cadastro de Cidade");
        montaTela();
        pack();
    }

    private void montaTela() {
        adicionaComponente(3, 1, 1, 2, "Nome", jtfNome);
        adicionaComponente(1, 1, 1, 1, "Código", jtfCodigo);
        adicionaComponente(5, 1, 1, 1, "Estado", jtfEstado);

        habilitaComponentes(false);
    }
}
