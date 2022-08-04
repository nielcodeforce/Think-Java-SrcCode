/*
 *  Demonstration of the concepts treated in the textbook.
*/
    public class thinkJavaCh04_42ex{
        
        public static void main(String args []){
            int numero = 11;
            String pet = "Peter.";
            String rua = "Rua João Cordeiro.";
            zool(pet, rua, numero);
            System.out.println(numero);
            System.out.println(pet);
            System.out.println(rua);
        }
        public static void zool(String a, String b, int num){
            System.out.println("Value "+num+", my pet at the time was "+a+" I grew up on "+b);
        }
    }
