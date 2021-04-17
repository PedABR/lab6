package lab6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Governo governo = new Governo(70);
        boolean cond = true;

        while(cond) {
            System.out.println("(C)adastrar pessoa" + '\n' +
                                "(E)dita pessoa" + '\n' +
                                "(e)dita criterios de vacinacao" + '\n' +
                                "(A)tualiza situacao" + '\n' +
                                "(M)ostra pessoa" + '\n' +
                                "(m)ostrar criterios de vacinacao" + '\n' +
                                "(S)air");

            String opcao = sc.nextLine();
            int cpf;
            switch (opcao) {
                case "C":
                    System.out.print("cpf: ");
                    cpf = sc.nextInt();
                    sc.nextLine();
                    System.out.print("nome: ");
                    String nome = sc.nextLine();
                    System.out.print("idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("numeroCartaoSus: ");
                    int numeroCartaoSus = sc.nextInt();
                    sc.nextLine();
                    System.out.print("email: ");
                    String email = sc.nextLine();
                    System.out.print("telefone: ");
                    int telefone = sc.nextInt();
                    sc.nextLine();
                    System.out.print("profissao: ");
                    String profissao = sc.nextLine();
                    governo.cadastraPessoa(nome, idade, cpf, numeroCartaoSus, email, telefone, profissao);
                    break;
                case "E":
                    System.out.print("cpf: ");
                    cpf = sc.nextInt();
                    sc.nextLine();
                    System.out.println("(N)ome" + '\n' +
                                        "(I)dade" + '\n' +
                                        "(E)mail" + '\n' +
                                        "(n)umero do cartão do sus" + '\n' +
                                        "(T)elefone" + '\n' +
                                        "(P)rofissao" + '\n' +
                                        "(A)dicionar comorbidade");
                    String op = sc.nextLine();
                    switch (op) {
                        case "N" -> {
                            System.out.print("Novo nome: ");
                            governo.editaNome(cpf, sc.nextLine());
                        }
                        case "I" -> {
                            System.out.print("Nova idade: ");
                            governo.editaIdade(cpf, sc.nextInt());
                            sc.nextLine();
                        }
                        case "E" -> {
                            System.out.print("Novo email: ");
                            governo.editaEmail(cpf, sc.nextLine());
                        }
                        case "n" -> {
                            System.out.print("Novo numero do cartao do sus: ");
                            governo.editaNumeroCartao(cpf, sc.nextInt());
                            sc.nextLine();
                        }
                        case "T" -> {
                            System.out.print("Novo telefone: ");
                            governo.editaTelefone(cpf, sc.nextInt());
                            sc.nextLine();
                        }
                        case "P" -> {
                            System.out.print("Nova profissao: ");
                            governo.editaProfissao(cpf, sc.nextLine());
                        }
                        case "A" -> {
                            System.out.print("Nova comorbidade: ");
                            governo.adicionaComorbidade(cpf, sc.nextLine());
                        }
                    }
                    break;
                case "e":
                    System.out.println("(I)dade minima" + '\n' +
                                        "(A)dicionar profissao prioritaria" + '\n' +
                                        "(a)dicionar comorbidade prioritaria");
                    String op2 = sc.nextLine();
                    switch (op2) {
                        case "I" -> {
                            System.out.print("Nova idade: ");
                            governo.setIdadeVacinacao(sc.nextInt());
                            sc.nextLine();
                        }
                        case "A" -> {
                            System.out.print("Nova profissao: ");
                            governo.adicionaProfissao(sc.nextLine());
                        }
                        case "a" -> {
                            System.out.print("Nova comorbidade: ");
                            governo.adicionaComorbidade(sc.nextLine());
                        }
                    }
                case "A":
                    governo.atualizaSituacao();
                    break;
                case "M":
                    System.out.print("cpf: ");
                    cpf = sc.nextInt();
                    sc.nextLine();
                    System.out.println(governo.mostraPessoa(cpf));
                    break;
                case "m":
                    System.out.println(governo.toString());
                    break;
                case "S":
                    cond = false;
                    break;
                default:
                    break;
            }
        }
    }
}
