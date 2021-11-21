package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void  menuPrincipal() {
        int menuInput = 0;

        do{
            String menu = "################################################\n"
                    + "# Faculdade SENAC - Cadastrador\n"
                    + "#\n"
                    + "# Escolha uma das opções abaixo:\n"
                    + "# 1 - Criar novo Cadastro\n"
                    + "# 2 - Ver Cadastros\n"
                    + "# 3 - Sair\n"
                    + "################################################\n";

            System.out.println(menu);

            menuInput = userInput.nextInt();

            switch (menuInput){
                case 1:
                    menuCadastros();
                    menuInput = 1;
                    break;

                case 2:
                    menuVisualizarCadastros();
                    menuInput = 1;
                    break;

                case 3:
                    menuInput = 0;
                    break;

                default:
                    System.out.println("# Opção Inválida! Tente Novamente!");
                    break;
            }

        } while (menuInput != 0);
    }

    private static void menuCadastros() {
        String menu = "################################################\n"
                + "# Faculdade SENAC - Cadastrador\n"
                + "#\n"
                + "# Escolha uma das opções abaixo:\n"
                + "# 1 - Cadastrar novo aluno\n"
                + "# 2 - Cadastrar novo professor\n"
                + "# 3 - Cadastrar novo fornecedor\n"
                + "# 4 - Voltar\n"
                + "################################################\n";

        System.out.println(menu);

        int menuInput = 0;

        do{
            menuInput = userInput.nextInt();

            switch (menuInput){
                case 1:
                    criarCadastro("Aluno");
                    menuInput = 1;
                    break;

                case 2:
                    criarCadastro("Professor");
                    menuInput = 1;
                    break;

                case 3:
                    criarCadastro("Fornecedor");
                    menuInput = 1;
                    break;

                case 4:
                    menuInput = 0;
                    break;

                default:
                    System.out.println("# Opção Inválida! Tente Novamente!");
                    break;
            }

        } while (menuInput != 0);
    }

    private static void menuVisualizarCadastros() {
        String menu = "################################################\n"
                + "# Faculdade SENAC - Cadastrador\n"
                + "#\n"
                + "# Escolha uma das opções abaixo:\n"
                + "# 1 - Listar aluno(s)\n"
                + "# 2 - Listar professor(es)\n"
                + "# 3 - Listar fornecedor(es)\n"
                + "# 4 - Voltar\n"
                + "################################################\n";

        System.out.println(menu);

        int menuInput = 0;

        do{
            menuInput = userInput.nextInt();

            switch (menuInput){
                case 1:
                    menuInput = 1;
                    break;

                case 2:
                    menuInput = 1;
                    break;

                case 3:
                    menuInput = 1;
                    break;

                case 4:
                    menuInput = 0;
                    break;

                default:
                    System.out.println("# Opção Inválida! Tente Novamente!");
                    break;
            }

        } while (menuInput != 0);
    }

    private static void criarCadastro(String tipo){
        userInput = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if(tipo == "Aluno") {
            Aluno aluno = new Aluno();

            char condicao;

            do {
                condicao = 'S';

                System.out.println("# Digite o nome do Aluno:\n>>");
                aluno.setNome(userInput.nextLine());

                System.out.println("# Digite o Endereço do Aluno:\n>>");
                aluno.setEndereco(userInput.nextLine());

                System.out.println("# Digite o Telefone do Aluno:\n>>");
                aluno.setTelefone(userInput.nextLine());

                System.out.println("# Digite o CPF do Aluno:\n>>");
                aluno.setCpf(userInput.nextLine());

                System.out.println("# Digite o Sexo do Aluno:\n>>");
                aluno.setSexo(userInput.nextLine().charAt(0));

                System.out.println("# Digite a Data de nascimento do Aluno(Formato dd/mm/aaaa):\n>>");
                try {
                    Date dataNascimento = formato.parse(userInput.nextLine());
                    aluno.setDataNascimento(dataNascimento);
                } catch (Exception e) {
                    System.out.println("Erro ao converter a data");
                }

                System.out.println("# Digite o E-mail do Aluno:\n>>");
                aluno.setEmail(userInput.nextLine());

                System.out.println("# Digite o Curso do Aluno:\n>>");
                aluno.setNome(userInput.nextLine());

                aluno.setStatusAluno("Ativo");

                System.out.println("# As informações estão corretas?\n # Sim ou Não?\n>>");
                condicao = userInput.nextLine().toUpperCase().charAt(0);

            } while (condicao == 'N');

            Arquivo arquivo = new Arquivo();
            boolean resultado = arquivo.gravarArquivo(aluno, tipo);

            menssagem(resultado, tipo);

            return;
        }

        if(tipo == "Professor") {
            Professor professor = new Professor();

            char condicao;

            do {
                condicao = 'S';

                System.out.println("# Digite o nome do Professor:\n>>");
                professor.setNome(userInput.nextLine());

                System.out.println("# Digite o Endereço do Professor:\n>>");
                professor.setEndereco(userInput.nextLine());

                System.out.println("# Digite o Telefone do Professor:\n>>");
                professor.setTelefone(userInput.nextLine());

                System.out.println("# Digite o CPF do Professor:\n>>");
                professor.setCpf(userInput.nextLine());

                System.out.println("# Digite o Sexo do Professor:\n>>");
                professor.setSexo(userInput.nextLine().charAt(0));

                System.out.println("# Digite a Data de nascimento do Professor (Formato dd/mm/aaaa):\n>>");
                try {
                    Date dataNascimento = formato.parse(userInput.nextLine());
                    professor.setDataNascimento(dataNascimento);
                } catch (Exception e) {
                    System.out.println("Erro ao converter a data");
                }

                System.out.println("# Digite o E-mail do Professor:\n>>");
                professor.setEmail(userInput.nextLine());

                System.out.println("# Digite a Data de Contratação do Professor(Formato dd/mm/aaaa):\n>>");
                try {
                    Date dataContratacao = formato.parse(userInput.nextLine());
                    professor.setDataContatacao(dataContratacao);
                } catch (Exception e) {
                    System.out.println("Erro ao converter a data");
                }

                System.out.println("# Digite o Matéria do Professor:\n>>");
                professor.setNome(userInput.nextLine());

                System.out.println("# Digite o Horário do Professor (Formato 24 Horas):\n>>");
                professor.setNome(userInput.nextLine());

                professor.setStatusProfessor("Ativo");

                System.out.println("# As informações estão corretas?\n # Sim ou Não?\n>>");
                condicao = userInput.nextLine().toUpperCase().charAt(0);

            } while (condicao == 'N');

            Arquivo arquivo = new Arquivo();
            boolean resultado = arquivo.gravarArquivo(professor, tipo);

            menssagem(resultado, tipo);

            return;
        }

        if(tipo == "Fornecedor") {
            Fornecedor fornecedor = new Fornecedor();

            char condicao;

            do {
                condicao = 'S';

                System.out.println("# Digite o nome do Fornecedor:\n>>");
                fornecedor.setNome(userInput.nextLine());

                System.out.println("# Digite o Endereço do Fornecedor:\n>>");
                fornecedor.setEndereco(userInput.nextLine());

                System.out.println("# Digite o Telefone do Fornecedor:\n>>");
                fornecedor.setTelefone(userInput.nextLine());

                System.out.println("# Digite o CNPJ do Fornecedor:\n>>");
                fornecedor.setCnpj(userInput.nextLine());

                System.out.println("# Digite o Nome Fantasia do Fornecedor:\n>>");
                fornecedor.setNomeFantasia(userInput.nextLine());

                System.out.println("# Digite o Produto fornecido:\n>>");
                fornecedor.setProduto(userInput.nextLine());

                System.out.println("# Digite a Data da última entrega feita (Formato dd/mm/aaaa):\n>>");
                try {
                    Date dataUltimaEntrega = formato.parse(userInput.nextLine());
                    fornecedor.setDataUltimaEntrega(dataUltimaEntrega);
                } catch (Exception e) {
                    System.out.println("Erro ao converter a data");
                }

                System.out.println("# Digite a Data da próxima entrega (Formato dd/mm/aaaa):\n>>");
                try {
                    Date dataProximaEntrega = formato.parse(userInput.nextLine());
                    fornecedor.setDataProximaEntrega(dataProximaEntrega);
                } catch (Exception e) {
                    System.out.println("Erro ao converter a data");
                }

                fornecedor.setStatus("Ativo");

                System.out.println("# As informações estão corretas?\n # Sim ou Não?\n>>");
                condicao = userInput.nextLine().toUpperCase().charAt(0);

            } while (condicao == 'N');

            Arquivo arquivo = new Arquivo();
            boolean resultado = arquivo.gravarArquivo(fornecedor, tipo);

            menssagem(resultado, tipo);

            return;
        }

        return;
    }

    private static void menssagem(boolean resultado, String tipo) {
        if(resultado){
            System.out.println("# "+tipo+" cadastrado com sucesso!\n>>");
        } else {
            System.out.println("# Erro ao cadastrar "+tipo+", tente novamente!\n>>");
        }
    }
}


