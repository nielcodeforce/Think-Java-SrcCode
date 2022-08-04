import java.util.Scanner;

public class CountOddOrEven {

    public static void main(String[] args) {

            Scanner askUser = new Scanner(System.in);
            System.out.print("Digite um número entre 1 e 1000: ");
            int num = askUser.nextInt();
            System.out.println();
            // entrada.close();


            if (num >= 1 && num <= 1000) {

                System.out.print("Enter if you want to list the odd numbers or the even ones, until that: ");
                String userOption = askUser.nextLine();

                if (userOption == "even") {
                    for (int i = 1; i <= num; i++) {
                        if ((i % 2) == 0) {
                            System.out.print(i+" ");
                        }
                    } System.out.println();
                }

                if (userOption == "odd") {
                    for (int i = 1; i <= num; i++) {
                        if((i % 2) != 0) {
                            System.out.print(i+" ");
                        }
                    } System.out.println();
                }

            } else { System.err.println("Valor inválido"); }

            System.out.println();
    }
}
