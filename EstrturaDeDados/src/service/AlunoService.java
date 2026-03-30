package service;

import model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoService {

    Scanner sc = new Scanner(System.in);
    private List<Aluno> lista = new ArrayList<>();


    public void cadastrarAlunos() {
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("RA: ");
        int ra = sc.nextInt();

        sc.nextLine();
        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        System.out.print("Média: ");
        Double media = sc.nextDouble();

        Aluno aluno = new Aluno(nome, ra, sexo, media);
        lista.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }


    public void listarAlunos() {
        for (Aluno a : lista) {
            System.out.println(a);
        }
    }


    public void relatorioNome() {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {

                if (lista.get(j).getNome()
                        .compareToIgnoreCase(lista.get(j + 1).getNome()) > 0) {

                    Aluno temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }

        System.out.println("\n--- RELATÓRIO POR NOME ---");
        listarAlunos();
    }


    public void relatorioRA() {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {

                if (lista.get(j).getRa() < lista.get(j + 1).getRa()) {

                    Aluno temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }

        System.out.println("\n--- RELATÓRIO POR RA (DECRESCENTE) ---");
        listarAlunos();
    }


    public void relatorioAprovados() {


        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {

                if (lista.get(j).getNome()
                        .compareToIgnoreCase(lista.get(j + 1).getNome()) > 0) {

                    Aluno temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }

        System.out.println("\n--- RELATÓRIO DE APROVADOS ---");

        for (Aluno a : lista) {
            if (a.getResultado().equalsIgnoreCase("Aprovado")) {
                System.out.println(a);
            }
        }
    }
}