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
import java.util.ArrayList;

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
    
    
             
    public void inserirJogador(Jogador jogador){
        String sql="Insert into Jogador(Nome,Idade,Elo,qtvitoria)" + 
                "values('"+jogador.getNome()+"'," + jogador.getIdade()+",'"+ jogador.getElo()+"',"+jogador.getQuantVitorias()+");";     
        try{
            declaracao.executeUpdate(sql);
        }   
        catch(Exception e){
            System.out.println("Erro:"+ e.getMessage());
            }
    }
    public ArrayList<Jogador> consultarJogadores(){
        String sql="Select * from Jogador;";
        ArrayList<Jogador> jogadores = new ArrayList();
        try{
            resultados= declaracao.executeQuery(sql);
            while(resultados.next()){
                Jogador jogador = new Jogador();
                jogador.setNome(resultados.getString("Nome"));
                jogador.setElo(resultados.getString("elo"));
                jogador.setIdJogador(resultados.getInt("idJogador"));
                jogador.setIdade(resultados.getInt("idade"));
                jogador.setQuantVitorias(resultados.getInt("qtvitoria"));
                jogadores.add(jogador);
            }
        }catch(Exception e){
            System.out.println("erro:"+e.getMessage());
        }
        return jogadores;
    }
    public void excluirJogador(int id){
        String sql="delete from Jogador where idJogador = " +id+";";
    try{
    declaracao.executeUpdate(sql);
    }catch(Exception e){
    System.out.println("Erro:" + e.getMessage());
    }
    }
}
