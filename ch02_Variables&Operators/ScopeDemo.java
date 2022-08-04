public class ScopeDemo{
        public static void main(String args[]){
            System.out.println("Program 2.5; ScopeDemo2.java; page 22\n");
            String EOEMessage = "\n--- End of Execution ---";
            {
                double pi = 3.14;
                double radius = 10;
                double area = pi * radius * radius;
                
                System.out.println("Within outer block:");
                System.out.println("Variables pi, radius and area are definded in the outer block.");
                System.out.println("Area is: "+area+"\n");
                    {
                        final double circumference = 2* pi * radius;
                        System.out.println("Within inner block:");
                        System.out.println("Variable circumference defined within inner block.");
                        System.out.println("Circumference is: "+circumference);
                    }
                System.out.println("\nWithin outer block again.");
                System.out.println("Variable circumference is not visible within outer block");
                //System.out.println("Circumference is: "+circumference);
                System.out.println(EOEMessage);
            }
        }
    }

//         System.out.println("ScopeDemo, PROGRAM 2.4, page 21\n");
//         
//         double pi = 3.14;
//         double radius = 10;
//         double area = pi * radius * radius;
//         
//         System.out.println("Within outer block:");
//         System.out.println("Variables pi, radius and area are definded in the outer block.");
//         System.out.println("Area is: "+area);
//         {
//             final double circumference = 2* pi * radius;
//             System.out.println("Within inner block:");
//             System.out.println("Variable circumference defined within inner block.");
//             System.out.println("Circumference is: "+circumference);
//         }
//         System.out.println("Within outer block again.");
//         System.out.println("Variable circumference is not visible within outer block");
//         System.out.println("Circumference is: "+circumference);
