package com.company;

public class Pessoa {
    private String nome;
    private String endereco;
    private int telefone;

    public Pessoa(String x, String y, int w){
        this.nome = x;
        this.endereco = y;
        this.telefone = w;
    }

    public Pessoa(){
        this.nome = "";
        this.endereco = "";
        this.telefone = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public int getTelefone(){
        return this.telefone;
    }

    public String setNome(String x){
        return this.nome = x;
    }

    public String setEndereco(String y){
        return this.endereco = y;
    }

    public int setTelefone(int w){
        return this.telefone = w;
    }

}
