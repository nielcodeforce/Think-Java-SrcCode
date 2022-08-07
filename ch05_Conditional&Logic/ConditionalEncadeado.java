/*
 *  Demonstration of the concepts treated in the textbook.
*/
    import java.util.Scanner;
    public class ConditionalEncadeado{
        public static void main(String args[]){
            double salario, novoSalario;
            Scanner in = new Scanner(System.in);
            System.out.print("Digite o atual salário do funcionario: ");
            salario = in.nextDouble();
            if (salario<500){
                novoSalario = salario+(salario * 0.15);
            } else {
                if (salario>500 && salario<=1000){
                novoSalario = salario+(salario * 0.10);
                } else { 
                    novoSalario=salario+(salario * 0.05);
                }
            } System.out.println("O novo valor do salário passa a ser: "+novoSalario);
        }
    }
