import java.util.Scanner;
public class IsEvenNumber{

    public static void main(String[]args){

        askUser();

    }

    public static void askUser(){
        System.out.print("Enter the number to evaluate: ");
        Scanner inputNum = new Scanner(System.in);
        int number = inputNum.nextInt();
        System.out.println("The number "+number+" is "+isEvenNumber(number));
    }


    public static String isEvenNumber(int number){
        if(number%2==0){
            return "Even";
        } else return "Odd";

    }

}
