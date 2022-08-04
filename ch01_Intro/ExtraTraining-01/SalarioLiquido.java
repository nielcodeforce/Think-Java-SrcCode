import java.util.Scanner;
public class SalarioLiquido{

    public static void main (String[]args){

        System.out.println("----------::::: SALARIO LIQUIDO :::::-----------");
        System.out.println("");
        Scanner askUser = new Scanner(System.in);
        System.out.println("Quantas horas diárias de trabalho?");
        double horaTrab = askUser.nextDouble();
        System.out.println("Qual o valor da hora?");
        double valHora = askUser.nextDouble();
        System.out.println("Informe o percentual de desconto: ");
        double percentDesc = askUser.nextDouble();
        askUser.close();

        printSalarioLiq(horaTrab, valHora, percentDesc);

    }

    public static double salarioLiquido(double horaTrab, double valHora, double percentDesc){

        if(horaTrab<0 || horaTrab>24) {
            System.out.println("Valor impossível para horas trabalhadas! Favor verificar.");
            return -1;
        } else if (valHora<=0){
            System.out.println("Valor impossível para unidade de hora trabalhada! Favor verificar.");
            return -1;
        } else {
            double salBruto = (horaTrab * valHora)*30;
            double totalDesc = (percentDesc/100) * salBruto;
            double salLiquido = salBruto - totalDesc;
//             System.out.println("Total do desconto aplicado: "+totalDesc);
//             System.out.println("---------------------------------------");
            return salLiquido;
        }
    }

    public static void printSalarioLiq(double horaTrab, double valHora, double percentDesc){
            System.out.println("\n------------------------------------------------\n");
            System.out.println("Total de horas trabalhadas/dia: "+horaTrab+"\nValor da hora de trabalho: "+valHora+" \nPercentual de desconto informado: " + percentDesc);
            System.out.println("Salario líquido (mensal): " + salarioLiquido(horaTrab, valHora, percentDesc) + " reais.");
            System.out.println("\n================================================");
    }
}
