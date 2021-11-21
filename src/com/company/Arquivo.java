package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	private File diretorio;
	private File arquivo;
	
	public Arquivo(String tipo) {
		this.diretorio = new File("C:\\DataBase"); 
    	if (!diretorio.exists()) {
    		boolean statusDir = diretorio.mkdir();
    	}
    	
    	this.arquivo = new File(diretorio, tipo+".txt"); 
    	if(!arquivo.exists()) {
    		try {
        		boolean statusArq = arquivo.createNewFile();
        	} catch (IOException e) {
        	    e.printStackTrace(); 
        	} 
    	}
	}
	
    public boolean gravarArquivo(Object objeto) {
    	try {
			FileWriter fileWriter = new FileWriter(this.arquivo, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(objeto.toString());
			printWriter.flush();
			printWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
        return true;
    }

    public boolean excluirArquivo() {
        return true;
    }

    public boolean atualizarArquivo() {
        return true;
    }

    public boolean lerArquivo() {
        try {
            FileReader fileReader = new FileReader(this.arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha = "";

            while ( ( linha = bufferedReader.readLine() ) != null) {
            	System.out.println(linha);
            }

            fileReader.close();
            bufferedReader.close();
    	} catch (IOException e) {
        	e.printStackTrace();
        }
        return true;
    }
}
