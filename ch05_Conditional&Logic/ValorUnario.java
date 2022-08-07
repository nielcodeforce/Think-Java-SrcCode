import java.util.Scanner;

public class ValorUnario {
	   public static void main(String[] args) {
			String resultado;
			Scanner scanValores = new Scanner(System.in);
			System.out.print("Entre com um valor inteiro: ");
			int n = scanValores.nextInt();
			resultado = n%2==0?"par":"impar";
			System.out.println("O valor é "+resultado+"!");
			// scanValores.close();
	   }
}
