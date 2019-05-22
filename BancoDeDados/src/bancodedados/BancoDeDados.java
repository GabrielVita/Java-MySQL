/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author aluno
 */
public class BancoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco();
        boolean conectou = banco.conectar();
        if(conectou){
            System.out.println("uuuuul conectou");
        }else{
            System.out.println("chore");
        }
        /*Jogador jogador = new Jogador();
        jogador.setElo("menos que bronze");
        jogador.setNome("Guilherme boi");
        jogador.setIdade(24);
        jogador.setQuantVitorias(24);
        //banco.inserirJogador(jogador);*/
        ArrayList<Jogador> jogadores = banco.consultarJogadores();
        for(int i =0; i<jogadores.size(); i++){
            System.out.println("nome:" + jogadores.get(i).getNome());
            System.out.println("elo:" + jogadores.get(i).getElo());
        }
        int idExcluir=Integer.parseInt(JOptionPane.showInputDialog(null,"Id para excluir"));
        banco.excluirJogador(idExcluir);
    }
    
}
