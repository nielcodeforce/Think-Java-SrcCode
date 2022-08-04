public class TypeCastDemo{
    public static void main(String args[]){
        
          System.out.println("(program 2.7, page 24)\n");
               byte b=0;
               int i=350;
               double d=300.25D;
               System.out.println("The initial value of 'byte b' is: "+b);
               b=(byte)i;
               System.out.println("Type Casting integer 'int i=350' to 'byte b' is: "+b);
               b=(byte)d;
               System.out.println("Type Casting double 'd=300.25' to 'byte b' is: "+b);
               System.out.println(300%256); //Testing the result of the casting from double to byte
                                            //which is the same as modulo.
        }
    }

//             System.out.println("(program 2.6, page 23)\n");
//             double d=12.35D;
//             int i;
//             float f;
//             f=d;
//             f=(float)d; //Type casting from double to float
//             i=(int)d; // Type casting from double to int
//             System.out.println("Type casting a double to a float");
//             System.out.println("After type casting, the value "+
//             "assigned to float variable 'f' is: "+f);
//             System.out.println("The value of the integer casted variable 'i' is: "+i);



//                System.out.println("(program 2.8, page 24)\n");
//                byte b=8;
//                short s= 20000;
//                int i1= b*s;
//                System.out.println("b * s = "+i1);
//                long l1=98345678901l;
//                long l2=l1+b+s+i1;
//                System.out.println("l1+b+s+i1: "+l2);
//                float f1=2.5f, f2;
//                f2=f1+b+s+l2;
//                System.out.println("f1+b+s+i1+l2: "+f2);
//                double d1=2.56789d,d2;
//                d2=d1*f2+b+s+l2;
//                System.out.println("d1*f2+b+s+l2: "+d2);
//                System.out.println(300%256); //Testing the result of the casting from double to byte
//                                             which is the same as modulo.
