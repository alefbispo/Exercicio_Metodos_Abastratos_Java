package aplication;

import entites.Contribuinte;
import entites.PessoaFisica;
import entites.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Entre com o numero de contribuintes: ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Contribuinte #"+i);

            System.out.print("Pessoa Fisica ou Judirica? (f/j): ");
            char ch = scan.next().charAt(0);
            scan.nextLine();

            System.out.print("Nome: ");
            String nome = scan.nextLine();

            System.out.print("Rendimento anual: ");
            double rend = scan.nextDouble();

            if (ch == 'f'){
                System.out.print("Valor gasto com saude: ");
                double gastoSaude = scan.nextDouble();

                PessoaFisica pf = new PessoaFisica(nome,rend,gastoSaude);
                list.add(pf);

            }else {
                System.out.print("Numero de funcionarios: ");
                int numFuncionarios = scan.nextInt();

                PessoaJuridica pj = new PessoaJuridica(nome,rend,numFuncionarios);
                list.add(pj);
            }
        }

        double tot = 0.0;
        System.out.println();
        System.out.println("Impostos pagos:");
        for (Contribuinte x : list) {
            tot += x.taxa();
            System.out.printf("%s: $ %.2f%n", x.getNome(),x.taxa());
        }
        System.out.println();
        System.out.printf("TOTAL DE IMPOSTOS: $ %.2f%n", tot);

        scan.close();
    }
}
