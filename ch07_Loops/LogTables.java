public class LogTables{
    
    public static void main(String[]args){
        System.out.println("Log Tables");
        System.out.println("----------");

        LogTable();

    }
    
    public static void LogTable(){
        final double LOG2 = Math.log(2); //declares LOG2 as a final (constant). No need to calc it all the time.
        int i = 1;
        while(i < 256){
            double x = (double) i;
            System.out.println(x + "  " + Math.log(x)/LOG2);
            i *= 2;  // i = i * 2;
        }
    }
    
}
