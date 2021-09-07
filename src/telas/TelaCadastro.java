package telas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class TelaCadastro extends JInternalFrame implements ActionListener {
    // Estados das telas
    private final int PADRAO = 0;
    private final int INCLUINDO = 1;
    private final int ALTERANDO = 2;
    private final int CONSULTANDO = 3;
    private final int EXCLUINDO = 4;

    // Botões que aparecem em todas as telas
    private JButton jbIncluir = new JButton("Incluir");
    private JButton jbAlterar = new JButton("Alterar");
    private JButton jbExcluir = new JButton("Excluir");
    private JButton jbConsultar = new JButton("Consultar");
    private JButton jbConfirmar = new JButton("Confirmar");
    private JButton jbCancelar = new JButton("Cancelar");

    private int estadoTela = PADRAO;

    protected JPanel jpComponentes = new JPanel();
    private JPanel jpBotoes = new JPanel();

    public TelaCadastro(String titulo) {
        super(titulo, true, true, true, true);
        setSize(800, 600);

        getContentPane().setLayout(new BorderLayout(2, 1));
        getContentPane().add(jpComponentes, "Center");
        jpComponentes.add(new JLabel("Olá"));

        getContentPane().add(jpBotoes, "South");
        
        adicionaBotao(jbIncluir);
        adicionaBotao(jbAlterar);
        adicionaBotao(jbExcluir);
        adicionaBotao(jbConsultar);
        adicionaBotao(jbConfirmar);
        adicionaBotao(jbCancelar);

        pack();
        setVisible(true);

        TelaSistema.jdp.add(this);

        habilitaBotoes();
    }

    private void adicionaBotao(JButton botao) {
        jpBotoes.add(botao);
        botao.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jbIncluir) {
            incluir();
        } else if (ae.getSource() == jbAlterar) {
            alterar();
        } else if (ae.getSource() == jbExcluir) {
            excluir();
        } else if (ae.getSource() == jbConsultar) {
            consultar();
        } else if (ae.getSource() == jbConfirmar) {
            confirmar();
        } else if (ae.getSource() == jbCancelar) {
            cancelar();
        }
    }

    private void habilitaBotoes() {
        if (estadoTela == PADRAO) {
            jbIncluir.setEnabled(true);
            jbAlterar.setEnabled(false);
            jbExcluir.setEnabled(false);
            jbConsultar.setEnabled(true);
            jbConfirmar.setEnabled(false);
            jbCancelar.setEnabled(false);
        }
    }

    public void incluir() {}
    public void alterar() {}
    public void excluir() {}
    public void consultar() {}
    public void confirmar() {}
    public void cancelar() {}
}
