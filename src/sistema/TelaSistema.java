package sistema;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaSistema extends JFrame implements ActionListener {
    private JMenuBar jmb;

    private JMenu jmCadastros, jmMovimentos, jmRelatorios;

    private JMenuItem jmiEstados, jmiCidades, jmiClientes, jmiFornecedores, jmiProdutos;

    public TelaSistema(String titulo) {
        super(titulo);
        setSize(800, 600);
        setVisible(true);
        montaMenu();
        adicionaListeners();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void montaMenu() {
        jmb = new JMenuBar();
        setJMenuBar(jmb);

        jmCadastros = new JMenu("Cadastros");
        jmMovimentos = new JMenu("Movimentos");
        jmRelatorios = new JMenu("Relatórios");
        
        jmb.add(jmCadastros);
        jmb.add(jmMovimentos);
        jmb.add(jmRelatorios);

        montaItensMenu();
    }

    private void montaItensMenu() {
        jmiEstados = new JMenuItem("Estados");
        jmiCidades = new JMenuItem("Cidades");
        jmiClientes = new JMenuItem("Clientes");
        jmiFornecedores = new JMenuItem("Fornecedores");
        jmiProdutos = new JMenuItem("Produtos");

        jmCadastros.add(jmiEstados);
        jmCadastros.add(jmiCidades);
        jmCadastros.add(jmiClientes);
        jmCadastros.add(jmiFornecedores);
        jmCadastros.add(jmiProdutos);
    }
    
    private void adicionaListeners() {
        jmiEstados.addActionListener(this);
        jmiCidades.addActionListener(this);
        jmiClientes.addActionListener(this);
        jmiFornecedores.addActionListener(this);
        jmiProdutos.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jmiEstados) {
            System.out.println("Cadastro de Estados");
        } else if (ae.getSource() == jmiCidades) {
            System.out.println("Cadastro de Cidades");
        }else if (ae.getSource() == jmiClientes) {
            System.out.println("Cadastro de Clientes");
        } else if (ae.getSource() == jmiFornecedores) {
            System.out.println("Cadastro de Fornecedores");
        } else if (ae.getSource() == jmiProdutos) {
            System.out.println("Cadastro de Produtos");
        }
    }
}
