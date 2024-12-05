import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oi, tudo bem. Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Você nasceu em que ano?");
        int dataNasc = scanner.nextInt();
        int idade = 2024 - dataNasc;

        if (idade >= 18 && idade <= 65) {
            System.out.println("Você tem idade para tirar carteira");
        } else if (idade > 65){
            System.out.println("Eu dirijo para você pode descançar ");
        }else {
            System.out.println("Você ainda e muito novo para tirar a carteira");
        }
        System.out.println(nome + " atualmente você está com " + idade + " anos.");


    }
}
