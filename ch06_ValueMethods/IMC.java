// Algoritmo IMC escrito de forma procedural
// Implementar tabela com faixas de valores e informação sobre condição de peso, sobrepeso, etc.

/*

import java.util.Scanner;

public class IMC {

  public static void main(String[]args) {

    float peso;
    float altura;
    float imc;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o peso da pessoa: ");
    peso = leitor.nextFloat();
    System.out.println("Digite a altura da pessoa (em metros): ");
    altura = leitor.nextFloat();

    imc = (peso / (altura * altura));
    System.out.println("IMC = " + imc);

  }
}

*/


// Algoritmo IMC escrito de forma procedural
// Implementar tabela com faixas de valores e informação sobre condição de peso, sobrepeso, etc.

import java.util.Scanner;

public class IMC {

  public static void main(String[]args) {

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe o nome, por favor: ");
    String nome = leitor.nextLine();
    System.out.println("Digite o peso da pessoa: ");
    float peso = leitor.nextFloat();
    System.out.println("Digite a altura da pessoa (em metros): ");
    float altura = leitor.nextFloat();

    System.out.println("IMC de " + nome + " igual à: " + calcularIMC(peso, altura));

  }

  public static float calcularIMC(float peso, float altura) {
    float imc = (peso / (altura * altura));
    return imc;
  }

}

