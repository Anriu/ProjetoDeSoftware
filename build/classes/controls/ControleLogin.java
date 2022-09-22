package controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.FuncionarioDAO;
import model.ServicoLogin;
import vision.TelaLogin;
import vision.TelaMenu;
import vision.TelaRecuperar;

public class ControleLogin implements ActionListener{
    
    private TelaRecuperar telaRecuperar = new TelaRecuperar();
    private final ServicoLogin servicoLogin = new ServicoLogin();
    private TelaLogin telaLogin;
    private final FuncionarioDAO funcionarioDAO;
    private String result;
    
    
    public ControleLogin() {
        //Construtor do ControleListagem que instacia um funcionarioDAO e uma telaLogin, só deixamos sua visibilidade valida depois de inicicar todos so componentes 
        telaLogin = new TelaLogin();
        funcionarioDAO = new FuncionarioDAO();
        telaLogin.getBotaoCadastro().addActionListener(this);
        telaLogin.getBotaoLogin().addActionListener(this);
        telaLogin.getBotaoRecup().addActionListener(this);
        telaLogin.getBotaoSair().addActionListener(this);
        telaRecuperar.getBotaoRecuperarSenha().addActionListener(this);
        telaLogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Evento do botão cadastro que cadastra um novo funcionario em nosso banco de dados
        if(e.getSource().equals(telaLogin.getBotaoCadastro())){
            //Metodo valida campos para saber se todos os dados foram devidademente preenchidos
            if(validaCamposCadastro()){
                
                Funcionario funcionario = new Funcionario();
                funcionario.setNomeFuncionario(telaLogin.getTxtUsuarioCadastro().getText());
                funcionario.setEmailFuncionario(telaLogin.getTxtEmailCadastro().getText());
                funcionario.setSenha(telaLogin.getTxtSenhaCadastro().getText());
                funcionarioDAO.salvar(funcionario);
                //JOptionPane para avisar que o cadastro foi realizado
                JOptionPane.showMessageDialog(telaLogin, "Cadastro realizado com sucesso", 
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                //JOptionPane pra caso o usuario não tenha preenchido tudo 
                JOptionPane.showMessageDialog(telaLogin, "Preencha todos os campos do cadastro", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        //Evendo do botão login que loga um funcionario ja cadastrado em nosso banco de dados e o leva para o menu principal 
        if(e.getSource().equals(telaLogin.getBotaoLogin())){
            if(validaCamposLogin()){
                
                 if(servicoLogin.checagemAcesso(telaLogin.getTxtEmailLogin().getText(), telaLogin.getTxtSenhaLogin1().getText())){
                    telaLogin.dispose();
                    TelaMenu telamenu = new TelaMenu();
                    telamenu.setVisible(true);
                } else{
                     JOptionPane.showMessageDialog(telaLogin, "Email do Usuário e/ou Senha incorreto(s)", 
                        "Erro", JOptionPane.ERROR_MESSAGE);           
        }
                
            }else{
                //JOptionPane pra caso o usuario não tenha preenchido tudo 
                JOptionPane.showMessageDialog(telaLogin, "Preencha todos os campos do login", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Evento do botão recuperar senha que permite o funcionario trocar a senha 
        if(e.getSource().equals(telaLogin.getBotaoRecup())){
            String result = coloarEmail();
            if(!result.isEmpty()){
            enviarCodigo(result);
        }
            
        }
        
        //Evento do botão sair 
        if(e.getSource().equals(telaLogin.getBotaoSair())){
            telaLogin.setVisible(false);
            
        }
        
        if(e.getSource().equals(telaRecuperar.getBotaoRecuperarSenha())){
            if(servicoLogin.checarCodigo(telaRecuperar.getTxtCodigo().getText())){
            
            if(telaRecuperar.checkPasswordFields()){
                servicoLogin.trocarSenha(telaRecuperar.getTxtNovaSenha().getText());
                abrirAlerta("Confirmação de Alteração de Senha","Senha alterada com sucesso", 1);
                telaRecuperar.cleanFields();
                telaRecuperar.setVisible(false); 
            } else{
                abrirAlerta("Senha(s) incorreta(s)", "Senhas informadas não conferem", 0);
            }
            
            } else{
                abrirAlerta("Código incorreto", "Código informado não confere com o código enviado", 0);
            }
        }
    }
  
    
    private String coloarEmail(){
        return telaLogin.openDialog();
    }
    private void enviarCodigo(String emailFuncionario){        
        if(servicoLogin.checarEmail(emailFuncionario)){
            servicoLogin.enviarCodigo();
            abrirAlerta("Confirmação de envio","Código enviado para " + emailFuncionario, 1);
            
            telaRecuperar.setVisible(true);
        } else{
            abrirAlerta("Código não enviado","Email do Usuário " + emailFuncionario + " não encontrado", 0);
        }                
    }
    
    
    private void abrirAlerta(String titulo, String mensagem, int tipo) {
        telaLogin.abrirAlerta(titulo, mensagem, tipo);
    }
    
    
    private boolean validaCamposCadastro(){    
        /*Valida se todos os campos estão preenchidos corretamente nos campos de texto usando o .equals para comparar com uma string vazia ou com o texto padrão de ada campo
        */
        if(telaLogin.getTxtEmailCadastro().getText().equals("") || telaLogin.getTxtEmailCadastro().getText().equals("Email")) return false;
        else if(telaLogin.getTxtSenhaCadastro().getText().equals("") || telaLogin.getTxtSenhaCadastro().getText().equals("...........") ) return false;
        else if(telaLogin.getTxtUsuarioCadastro().getText().equals("") || telaLogin.getTxtUsuarioCadastro().getText().equals("Usuario")) return false;
        else return true;        
    }
    
    private boolean validaCamposLogin(){    
        /*Valida se todos os campos estão preenchidos corretamente nos campos de texto usando o .equals para comparar com uma string vazia ou com o texto padrão de ada campo
        */
        if(telaLogin.getTxtEmailLogin().getText().equals("") || telaLogin.getTxtEmailLogin().getText().equals("Email")) return false;
        else if(telaLogin.getTxtSenhaLogin1().getText().equals("")||telaLogin.getTxtSenhaLogin1().getText().equals("Senha")) return false;
        else return true;        
    }
}
