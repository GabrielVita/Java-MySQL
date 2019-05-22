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
public class Jogador {
    private int idJogador;
    private String nome;
    private int idade;
    private String elo;
    private int quantVitorias;

    public int getQuantVitorias() {
        return quantVitorias;
    }

    public void setQuantVitorias(int quantVitorias) {
        this.quantVitorias = quantVitorias;
    }

    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getElo() {
        return elo;
    }

    public void setElo(String elo) {
        this.elo = elo;
    }

   
    
}
