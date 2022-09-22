package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO {
    
    
    public void salvar(Funcionario funcionario){
        /*String para inserir os valores na tabela unidade que tem:
        id int,
        nome varchar,
        email varchar,
        senha varchar 
        */ 
        String sql = "INSERT INTO funcionario (nome_funcionario,email_funcionario,senha_funcionario) VALUES (?,?,md5(?))";
            PreparedStatement pst;
            try{
             
                pst = Conexao.getConnection().prepareStatement(sql);     
                pst.setString(1, funcionario.getNomeFuncionario());
                pst.setString(2, funcionario.getEmailFuncionario());
                pst.setString(3, funcionario.getSenha());
                pst.execute();
                pst.close();
            
            } catch (SQLException ex){
                System.out.println(ex);
            }
                      
    }
    
    
    //Metodo para logar o funcionario com base no que está salvo o sql
    public Funcionario loginFuncionario(String email, String senha){
        
        String sql = "SELECT * FROM funcionario WHERE email_funcionario = ? AND senha_funcionario = md5(?)";
        Funcionario funcionario = new Funcionario();
        
        PreparedStatement pst;
        ResultSet rs;
        
        try{
            pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, senha);
            rs = pst.executeQuery();

            while(rs.next()){
                funcionario.setId(rs.getInt("id"));
                funcionario.setEmailFuncionario(rs.getString("email_funcionario"));
                funcionario.setSenha(rs.getString("senha_funcionario"));
            }

            rs.close();
            pst.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        
        return funcionario;
        
    }
   
    
    //Metodo para pesquisar o email do funcionario no banco de dados
    public Funcionario encontrarEmail(String email){
        String sql = "SELECT * FROM funcionario WHERE email_funcionario LIKE ?";
        
        Funcionario funcionario = new Funcionario();
        funcionario.setEmailFuncionario("");
        
        PreparedStatement pst;
        ResultSet rs;
        
        try {
            pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, email);
            rs = pst.executeQuery();
            
            while(rs.next()){
                funcionario.setEmailFuncionario(rs.getString("email_funcionario"));
            }
            
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return funcionario;
    }
    
    //Metodo para trocar a senha 
    public void trocarSenha(Funcionario funcionario){
        
        String sql = "UPDATE funcionario SET senha_funcionario = md5(?) WHERE email_funcionario LIKE ?";
        
        PreparedStatement pst;
        try {
            pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, funcionario.getSenha());
            pst.setString(2, funcionario.getEmailFuncionario());
            pst.execute();
            pst.close();              
        } catch (SQLException ex) {
            System.out.println(ex);
        }
                      
        
    }
    
   
    
}
