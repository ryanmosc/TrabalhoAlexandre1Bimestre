import model.Aluno;
import model.AlunoEnum;
import service.AlunoService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opcao;
        AlunoService service = new AlunoService();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n1. Cadastrar Aluno");
            System.out.println("2. Relatório por Nome (Crescente)");
            System.out.println("3. Relatório por RA (Decrescente)");
            System.out.println("4. Relatório de Aprovados");
            System.out.println("5. Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> service.cadastrarAlunos();
                case 2 -> service.relatorioNome();
                case 3 -> service.relatorioRA();
                case 4 -> service.relatorioAprovados();
            }

        } while (opcao != 5);
    }
}