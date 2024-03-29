package org.experis.exercise2;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Inserisci il tuo nome: ");
        String nome = scan.nextLine();

        int numeroConto = random.nextInt(1001);
        Conto conto = new Conto(nome, numeroConto);
        System.out.println("Il tuo conto si chiama: " + conto.titolare + numeroConto);

        int choiceUsers = -1;
        while (choiceUsers != 4) {
            System.out.println("Menu:");
            System.out.println("1. Vuoi versare del denato?");
            System.out.println("2. Vuoi prelevare del denaro?");
            System.out.println("3. Vuoi sapere qual'è il tuo saldo?");
            System.out.println("4. Esci");
            System.out.print("Scelta: ");
            choiceUsers = scan.nextInt();

            if (choiceUsers == 1) {
                System.out.print("Quanto vuoi versare? ");
                double versamento = scan.nextInt();
                conto.versamento(versamento);
                System.out.println("Il versamento è andato a buon fine, il tuo saldo è: " + conto.getSaldo());
            } else if (choiceUsers == 2) {
                System.out.print("Quanto vuoi prelevare? ");
                double prelievo = scan.nextInt();
                if (conto.prelevare(prelievo)) {
                    System.out.println("Il prelievo è andato a buon fine, il tuo saldo è: " + conto.getSaldo());
                }
            } else if (choiceUsers == 3) {
                System.out.println("Il tuo saldo è di: " + conto.getSaldo());
            } else if (choiceUsers == 4) {
                System.out.println("Grazie per averci scelto. Arrivederci.");
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }


        scan.close();
    }
}
