/*
 *  Demonstration of the concepts treated in the textbook.
 */

    public class AddingNewMethods{
        
        public static void newLine(){
            System.out.println();
        }
        
        public static void twoLine(){
            newLine();
            newLine();
        }
        
        public static void printTwice(String s){
            System.out.println(s);
            System.out.println(s);
        }
        
        public static void main(String args []){
            String neverSay = "Never say never";
            System.out.println("First line.");
            newLine();
            System.out.println("Second line.");
            newLine();
            printTwice("Dont make me say this twice!");
            twoLine();
            printTwice(neverSay);
            System.out.println("Final line.");
        }
    }
