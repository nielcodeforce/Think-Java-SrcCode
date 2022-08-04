/* Variables and Data Types - Declaring and using variables in Java

Declaring a variable in Java is done by defining its Type and Name (Identifier). Example: int numHours;
Initializing a variable means to assign a value to that variable which is done with the assignment operator = and the value that's to be hold by the variable.


Primitive Data Types in Java: byte, short, int, long, float, double, char, boolean. 

Naming conventions for variables identifiers:

*/
public class VariablesDemo {
    public static void main(String[] args){
        
        System.out.println("\n..:: CHAR AND BOOLEAN VARIABLES ::..");

        char myCharVar = 'D';
        char myCharVar2 = 'R';
        System.out.println (myCharVar);
        System.out.println (myCharVar2);
        char CopyrightVar = '\u00A9';
        System.out.println (CopyrightVar);

        boolean isCostumerOverEighteen = true;
        System.out.println("Once "+isCostumerOverEighteen);
        isCostumerOverEighteen = false;
        System.out.println("Now it's "+isCostumerOverEighteen);
        }
}
