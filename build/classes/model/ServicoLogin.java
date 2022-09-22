package model;

public class ServicoLogin {

    //Classe para poder fazer login 
    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    private int codigoSenha = 0;
    private String emailFuncionario = "";
    private String useremail;
 
    //Metodo que checa se o acesso de login pode ser feito
    public boolean checagemAcesso(String email, String senha){
        return(funcionarioDAO.loginFuncionario(email, senha).getId()>0);            
    }
    
    //Metodo para checar o email
    public boolean checarEmail(String emailFuncionario){
        useremail = emailFuncionario;
        Funcionario funcionario = funcionarioDAO.encontrarEmail(emailFuncionario);
        return funcionario.getEmailFuncionario().equals(emailFuncionario);
    }
    //Metodo para eviar o codigo 
    public void enviarCodigo() {
        codigoSenha = gerarCodigoSenha();
        System.out.println(codigoSenha);        
    }
    
    //Metodo que cria o codigo de mudança de senha 
    private int gerarCodigoSenha(){
        return (int) (Math.random() * 1000000);
    }
    
    //Metodo que chega o codigo de mudança de senha 
    public boolean checarCodigo(String textCode) {
        
        if(textCode.equals("")){
            
            return false;
            
        } else {
            
            int code = Integer.parseInt(textCode);
            
            return (code==codigoSenha);
        }
        
    }
    //Metodo para mudar a senha 
    public void trocarSenha(String novaSenha) {
        Funcionario funcionario = new Funcionario();
        funcionario.setEmailFuncionario(emailFuncionario);
        funcionario.setSenha(novaSenha);
        funcionarioDAO.trocarSenha(funcionario);
    }


 
}
