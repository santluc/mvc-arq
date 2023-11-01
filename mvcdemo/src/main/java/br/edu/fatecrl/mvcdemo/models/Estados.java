package br.edu.fatecrl.mvcdemo.models;

public class Estados {

    private String nome;
    private String capital;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }


    public Estados(String nome, String capital) {
        this.nome = nome;
        this.capital = capital;
    }
}