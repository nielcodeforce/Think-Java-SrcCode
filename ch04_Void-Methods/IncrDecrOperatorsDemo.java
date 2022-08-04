public class IncrDecrOperatorsDemo{
    public static void main(String args[]){
        int x=100;
        int y=200;
        int a,b,c,d=102;
        
        a=++x;
        b=y++;
        
        System.out.println("a= "+a);
        System.out.println("x= "+x);
        System.out.println("b= "+b);
        System.out.println("y= "+y);
        c=--a;
        d=b--;
        System.out.println("a= "+a);
        System.out.println("c= "+c);
        System.out.println("b= "+b);
        System.out.println("d= "+d);
    }
}
