package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
    
    private static Connection connection;
    
    public static Connection getConnection(){
        
        if(connection == null){
            try {
                //Estabelece uma conexão com o banco projetoCondominio
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","root");
            } catch (SQLException ex) {
                //JOptionPane para alertar que a conexão não foi realizada 
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        return connection;
    }
    
}
