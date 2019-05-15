/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class Banco {
    private Connection conexao = null;
    private Statement declaracao = null;
    private ResultSet resultados = null;
    
    public boolean conectar(){
            String servidor = "jdbc:mysql://localhost:3306/lol";
            String usuario = "root";
            String senha = "cimatec";
            String driver = "com.mysql.jdbc.Driver";
            
            try {Class.forName(driver);
                this.conexao = (Connection) DriverManager.getConnection(servidor,usuario, senha);
                this.declaracao = (Statement) this.conexao.createStatement();
                } catch (Exception e){
                    System.out.println("Erro "+ e.getMessage());
                }
                if(this.conexao!=null){
                    return true;
                }else{
                    return false;
                }
                    
    }
}
