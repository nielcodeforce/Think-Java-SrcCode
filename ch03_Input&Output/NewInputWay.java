/*
 *  Demonstration of the concepts treated in the textbook.
 */
    import java.util.Scanner;
    public class NewInputWay{
        public static void main(String args []){
            Scanner myVar = new Scanner(System.in);
            System.out.print("Entre com o seu nome: ");
            System.out.println("Olá, " + myVar.nextLine());
            String userFirstName = myVar.nextLine();
            System.out.println("Agora o seu sobrenome: ");
            String userName = myVar.nextLine();
            System.out.println("Seu sobrenome é: "+userName);
            System.out.print("Digite sua idade: ");
            int idade = myVar.nextInt();
            System.out.print(userFirstName+" "+userName+", Idade: "+idade+".\n");
        }
    }
