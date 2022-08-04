/*
 * System.out.println("Welcome! What's your name? ");
 * Scanner ask = new Scanner(System.in); // Cria o objeto Scanner para leitura da entrada de dados.
 * String name = ask.next();
 * System.out.println("Hello, " + name + "!");
 * 
 */

import java.util.Scanner;
public class LearnScanner {
	public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("What is your name? ");
        String name = getInput.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("Sorry to bother you, but shall I know your second name? "); // a new question
        String secondname = getInput.nextLine();
        System.out.println("Hey, "+ name +" "+secondname +"!");
    }
}
