/*
 *  Demonstration of the concepts treated in the textbook.
 *  Metodo equals - comparador de Strings. Livro texto 'Think Java', pagina 58.
*/
    import java.util.Scanner;
    public class MetodoEquals{
        public static void main(String args[]){
            
            Scanner input = new Scanner(System.in);
            System.out.print("Digite uma palavra, por favor: ");
            String wordSeq1= input.nextLine();
            System.out.print("Agora digite uma segunda palavra: ");
            String wordSeq2 = input.nextLine();
            System.out.print("IS "+wordSeq2+" EQUAL TO "+wordSeq1+"? ");
            
            System.out.println(wordSeq2.equals(wordSeq1));
        }
    }
