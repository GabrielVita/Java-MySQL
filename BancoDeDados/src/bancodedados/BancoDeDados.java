/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;



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
    }
}
