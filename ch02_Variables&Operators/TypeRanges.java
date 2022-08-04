/* Variables and Data Types - Declaring and using variables in Java

Declaring a variable in Java is done by defining its Type and Name (Identifier). Example: int numHours;
Initializing a variable means to assign a value to that variable which is done with the assignment operator = and the value that's to be hold by the variable.


Primitive Data Types in Java: byte, short, int, long, float, double, char, boolean. 

Naming conventions for variables identifiers:


*/
public class TypeRanges {
    public static void main(String[] args){
        
        System.out.println("...:::INTEGER DATA TYPE:::...");
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
    
        System.out.println("...:::BYTE DATE TYPE:::...");
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
      
        System.out.println("...:::SHORT DATA TYPE:::...");
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
      
        System.out.println("...:::LONG DATA TYPE:::...");
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        
        System.out.println ("...:::FLOAT DATA TYPE:::...");
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
   
        System.out.println("...:::DOUBLE DATA TYPE:::...");
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        }
}
