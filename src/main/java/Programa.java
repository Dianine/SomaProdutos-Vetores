import Entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos Produtos serão informados ?");
        int n = sc.nextInt();
        Produto [] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Nome do Produto " + (i+1) + " : ");
            sc.nextLine();
            String produto = sc.nextLine();
            System.out.print("Preço do Produto " + (i+1) + " R$: ");
            double price = sc.nextDouble();
            System.out.println("-------------------------------------------");
            vect [i] = new Produto (produto, price);
        }
        double soma = 0.0;
        for (int i = 0; i < vect.length; i ++) {
            soma += vect[i].getPric();
        }
        System.out.print("Valor Total : " +  soma);


        sc.close();
    }
}
