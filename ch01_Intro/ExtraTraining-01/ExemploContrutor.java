public class ExemploContrutor {

	public ExemploContrutor(){}

    public int operacao(int A, int B){
        int resultado = A;
        for(int i=1;i <= B;i++){
            resultado = resultado * A;
            System.out.println("Resultado = " + resultado);
        }
         return resultado;
    }

    public static void main(String args[]){
        ExemploContrutor cal = new ExemploContrutor();
        System.out.println(cal.operacao(2,2));
        System.out.println(cal.operacao(2,5));
      }
}

