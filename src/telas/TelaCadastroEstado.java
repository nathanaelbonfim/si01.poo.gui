package telas;

import componentes.MeuJTextField;

public class TelaCadastroEstado extends TelaCadastro {
    private MeuJTextField jtfCodigo = new MeuJTextField(10, "Código");
    private MeuJTextField jtfNome = new MeuJTextField(20, "Nome");
    private MeuJTextField jtfSigla = new MeuJTextField(2, "Sigla");

    
    public TelaCadastroEstado() {
        super("Cadastro de Estado");

        montaTela();
        pack();
    }
    
    public void montaTela() {
        adicionaComponente(1, 1, 1, 1, jtfCodigo);
        adicionaComponente(3, 1, 1, 2, jtfNome);
        adicionaComponente(5, 1, 1, 1, jtfSigla);

        habilitaComponentes(false);
    }
}
