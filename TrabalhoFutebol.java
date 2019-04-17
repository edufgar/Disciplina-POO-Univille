
// Programa desenvolvido sobre o tema Futebol no caso o jogo da final do Paulistão entre São Paulo e Corinthians

import java.util.Scanner;

public class TrabalhoFutebol {

    public static void main(String[] args) {

        System.out.println("Estatisticas de Futebol no Majestoso\n");
        Scanner lugarjogo = new Scanner(System.in);

        while (true) {

            // Solicita que o usuário digite uma informação

            System.out.println("Provável vitorioso no Morumbi, digite 1: ");
            System.out.println("Provável vitorioso no Itaquerão, digite 2: ");
            System.out.println("Para Sair, digite 3: ");
            int optmenu = lugarjogo.nextInt();

            if (optmenu == 1) {

                int ttljogosmor = 50 + 38 + 57;
                double vitcormor = ((50 * 100) / ttljogosmor);
                double vittricmor = ((38 * 100) / ttljogosmor);
                double empatesmor = ((57 * 100) / ttljogosmor);

                System.out.println("Provável vitória do Corinthians no Morumbi é de " + vitcormor + "%");
                System.out.println("Provável vitória do São Paulo no Morumbi é de " + vittricmor + "%");
                System.out.println("Probabilidade de empate no Morumbi é de " + empatesmor + "% \n");

            } else if (optmenu == 2) {

                int ttljogosita = 7 + 3;
                double vitcorita = ((7 * 100) / ttljogosita);
                double vittricita = ((0 * 100) / ttljogosita);
                double empatesita = ((3 * 100) / ttljogosita);

                System.out.println("Provável vitória do Corinthians no Itaquerão é de " + vitcorita + "%");
                System.out.println("Provável vitória do São Paulo no Itaquerão é de " + vittricita + "%");
                System.out.println("Probabilidade de empate no Itaquerão é de " + empatesita + "% \n");

            } else {

                // Encerra o loop infinito

                System.out.println("\nTchau");

                break;
            }

        }

    }

}
