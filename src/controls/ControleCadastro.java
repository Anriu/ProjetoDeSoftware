package controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.FuncionarioDAO;
import vision.TelaCadastro;

public class ControleCadastro implements ActionListener{
    
    private TelaCadastro telaCadastro;
    private final FuncionarioDAO funcionarioDAO;
    private String result;
    
    public ControleCadastro() {
        //Construtor do ControleListagem que instacia um funcionarioDAO e uma telaLogin, só deixamos sua visibilidade valida depois de inicicar todos so componentes 
        telaCadastro = new TelaCadastro();
        funcionarioDAO = new FuncionarioDAO();
        telaCadastro.getBotaoCadastro1().addActionListener(this);
        telaCadastro.getBotaoVoltar().addActionListener(this);
        telaCadastro.setVisible(true);
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        //Evento do botão cadastro que cadastra um novo funcionario em nosso banco de dados
        if(e.getSource().equals(telaCadastro.getBotaoCadastro1())){
            //Metodo valida campos para saber se todos os dados foram devidademente preenchidos
            if(validaCamposCadastro() && compararSenhas()){
                
                Funcionario funcionario = new Funcionario();
                funcionario.setNomeFuncionario(telaCadastro.getTxtNomeCadastro().getText());
                funcionario.setEmailFuncionario(telaCadastro.getTxtEmailCadastro().getText());
                funcionario.setSenha(telaCadastro.getTxtSenhaCadastro().getText());
                funcionarioDAO.salvar(funcionario);
                //JOptionPane para avisar que o cadastro foi realizado
                JOptionPane.showMessageDialog(telaCadastro, "Cadastro realizado com sucesso", 
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                //JOptionPane pra caso o usuario não tenha preenchido tudo 
                JOptionPane.showMessageDialog(telaCadastro, "Campos vazios ou senhas diferentes", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        
        //Evento do botão voltar 
        if(e.getSource().equals(telaCadastro.getBotaoVoltar())){
            telaCadastro.setVisible(false);
            ControleLogin controleLogin = new ControleLogin();
        }
    }
    
    private boolean compararSenhas(){
        if(telaCadastro.getTxtRepetirSenhaCadastro().getText().equals(telaCadastro.getTxtRepetirSenhaCadastro().getText())) return true;
        else return false;
    
    }
     
    private boolean validaCamposCadastro(){    
        /*Valida se todos os campos estão preenchidos corretamente nos campos de texto usando o .equals para comparar com uma string vazia ou com o texto padrão de ada campo
        */
        if(telaCadastro.getTxtEmailCadastro().getText().equals("") || telaCadastro.getTxtEmailCadastro().getText().equals("Email")) return false;
        else if(telaCadastro.getTxtSenhaCadastro().getText().equals("") || telaCadastro.getTxtSenhaCadastro().getText().equals("Senha") ) return false;
        else if(telaCadastro.getTxtRepetirSenhaCadastro().getText().equals("") || telaCadastro.getTxtRepetirSenhaCadastro().getText().equals("Repetir Senha") ) return false;
        else if(telaCadastro.getTxtNomeCadastro().getText().equals("") || telaCadastro.getTxtNomeCadastro().getText().equals("Nome")) return false;
        else return true;        
    }
    
}
