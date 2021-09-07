package telas;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import componentes.MeuJComboBox;
import componentes.MeuJTextField;

public class TelaCadastroCidade extends TelaCadastro {
    private MeuJTextField jtfNome   = new MeuJTextField(20);
    private MeuJTextField jtfCodigo = new MeuJTextField(10);

    private String[] dados = {"PR", "SP"};
    private MeuJComboBox jcbEstado  = new MeuJComboBox(dados);

    public TelaCadastroCidade() {
        super("Cadastro de Cidade");
        montaTela();
        pack();
    }

    private void montaTela() {
        adicionaComponente(3, 1, 1, 2, "Nome", jtfNome);
        adicionaComponente(1, 1, 1, 1, "Código", jtfCodigo);
        adicionaComponente(5, 1, 1, 1, "Estado", jcbEstado);

        habilitaComponentes(false);
    }
}
