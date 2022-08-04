    public class TypePromotionRules{
        public static void main(String args[]){
               System.out.println("(program 2.8, page 24)\n");
               byte b=8;
               short s= 20000;
               int i1= b*s;
               
//                System.out.println(b=400);
//                System.out.println("'byte b' is now: "+b);
               
               System.out.println("b * s = "+i1);
               long l1=98345678901l;
               long l2=l1+b+s+i1;
               System.out.println("l1+b+s+i1: "+l2);
               float f1=2.5f, f2;
               f2=f1+b+s+l2;
               System.out.println("f1+b+s+i1+l2: "+f2);
               double d1=2.56789d,d2;
               d2=d1*f2+b+s+l2;
               System.out.println("d1*f2+b+s+l2: "+d2);
               System.out.println(300%256); //Testing the result of the casting from double to byte
                                            //which is the same as modulo.
               double myDValue = b;
               System.out.println(myDValue);//Showing the resulting type of variable b after 
                                            //all automatic casting
        }
    }
