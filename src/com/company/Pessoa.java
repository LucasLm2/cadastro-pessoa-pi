package com.company;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
    }

    public String getNome() {
        return this.nome;
    }
    
    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String setEndereco(String endereco) {
        return this.endereco = endereco;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public String setTelefone(String telefone) {
        return this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public boolean gravarArquivo() {
    	return true;
    }
    
    public boolean excluirArquivo() {
    	return true;
    }
    
    public boolean atualizarArquivo() {
    	return true;
    }
    
    public boolean lerArquivo() {
    	return true;
    }
    
}
