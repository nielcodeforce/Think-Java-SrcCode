public class CreatingArrays{

    public static void main(String[]args){
        
        System.out.println("Arrays - The Learning Experience!\n");
        
        // DECLARING the arrays
        
        int[] counts; // Declaring the 'counts Array' of type int 
        double[] values; // Declaring the 'values Array' of type double
        
        // Array variables are created but are not refering to any Array yet
        
        // CREATING the Arrays
        
        int size = 7;
        
        counts = new int[4]; // Creating the counts Array - elements initialized to zero
        values = new double[size]; // Creating the values Array - elements initialized to zero
        
        int[] nums = counts;  // Creating and making it iqual to counts
        int[] lista = {1,2,3,4,5};

        float testVariable[] = {5.4f, 3.2f, 8.7f};
        System.out.println ("Displaying one of the elements of testVariable array: "+testVariable[2]);
        System.out.println ("The size of the array is: "+testVariable.length);
        
        counts[0] = 7;
        counts[1] = counts [0]*2;
        counts[2] ++;
        counts[3] -= 60;
        System.out.println(counts + " Is the memory reference of 'counts'");
        System.out.println("The first element of counts is: " + counts[0]);
        System.out.println("The second element of counts is: " + counts[1]);
        System.out.println("The third element of counts is: " + counts[2]);
        System.out.println("The value of the 4th element of counts is: " + counts[3]);
        counts[3] += 5;
        System.out.println("Now the value of the 4th element of counts is: " + counts[3]);
        
        int i = 0;
        while (i<4){
            System.out.println(counts[i]);
            i++;
        }
        
        System.out.println("This is the nums array: ");
        for(int n = 0; n<4; n++) {
            System.out.println(nums[n]);
        }
        
        System.out.println("This is the lista array: ");
        for (int l = 0; l < 4; l++){
            System.out.println(lista[l]);
        }
        
        System.out.println("Two more arrays: a and b");
        int[] b = new int[4];
        int[] a = {1,2,3,4};
        
        b = a;
        
        System.out.println("{"+a[0]+","+a[3]+"}"+".");
        System.out.println(b[0]);
        System.out.println(a[0]+a[1]+a[2]+a[3]);
        
    }

}

/*
public class CreatingArraysTwo{

    public static void main(String[]args){
        
        System.out.println("Arrays - The Learning Experience II!\n");

        // int[] teams = new int[5];
        int[] teams = {1, 2, 3, 4, 5}; // Declaring the Array and assigning its elements in one single step

        System.out.println(teams+" Is the memory reference of 'teams'"); // Printing out the reference to an array NOT the Array itself
        System.out.println("The first element of teams is teams[0] = " + teams[0]);
        System.out.println("The second element of teams is teams[1] = " + teams[1]);
        System.out.println("The third element of teams is teams[2] = " + teams[2]);
        System.out.println("The forth element of teams is teams[3] = " + teams[3]);
        teams[3]+= 25;
        System.out.println("The forth element of teams is now: " + teams[3]);
        
        System.out.println("The 5th element of teams is teams[4] = " + teams[4]);
        teams[4] = (3+6)*2;
        System.out.println("Now we make teams[4] = (3+6)*2 = " + teams[4]);
        
        
        String[] nomes = new String[5];
        
        nomes[0]="Renata";
        nomes[1]="Nikolas";
        nomes[2]="Natalia";
        nomes[3]="Leticia";
        nomes[4]="Daniel";
        
        System.out.println("The second element of String[] nomes[1] is: "+ nomes[1]);
        System.out.println("nomes[3]= " + nomes[3]);
        System.out.println("nomes[2]= " + nomes[2]);

        System.out.println("Entire Array 'Nomes': ");
        for(int i=0;i<5;i++){
            System.out.println(nomes[i]);
        }
        
    }

}


public class CreatingArraysThree{

    public static void main(String[]args){
        
        System.out.println("!!! Start of Arrays' Learning Experience !!!\n");
        // Declaring the Arrays
        
        int size = 7;
        int[] counts = new int[4];
        double[] values = new double[size];

        // int[] days = counts;
        int[] days = new int[size];
        
        //int[] teams = new int[5];
        int[] teams = {1, 2, 3, 4, 5}; // Declaring the Array and assigning its elements in one single step
        teams[4] = 12;
        teams[1] = 10;
        
        System.out.println("The first element of teams is: "+ teams[0]);
        System.out.println("The second element of teams is: "+ teams[1]);
        System.out.println("The forth element of teams is: "+ teams[4]);
        // System.out.println("The OFB element of teams is: "+ teams[6]); // this generates an exception!
        teams[4]++;
        System.out.println("The forth element of teams is now: "+ teams[4]);
        System.out.println(teams+" Is the memory reference of 'teams'"); // Printing out the reference to an array NOT the Array itself
        
        counts[0] = 7;
        counts[1] = counts [0]*2;
        counts[2] ++;
        counts[3] -= 60;
        
        System.out.println("The first element of counts is: "+ counts[0]);
        System.out.println("The second element of counts is: "+ counts[1]);
        System.out.println("The third element of counts is: "+ counts[2]);
        System.out.println("The fourth element of counts is: "+ counts[3]);
        System.out.println(counts+" Is the memory reference of 'counts'");

        int i = 0;
        while(i<4){
            System.out.println(counts[i]);
            i++;
        }
        
        String[] nomes = new String[5];
        
        nomes[0]="Daniel";
        nomes[1]="Renata";
        nomes[2]="Natalia";
        nomes[3]="Letícia";
        nomes[4]="Nikolas";
        
        System.out.println("The second element of String[] nomes[1] is: "+ nomes[1]);
        System.out.println(nomes[3]);
        
        int n = 0;
        while(n<5){
            System.out.println(nomes[n]);
            n++;
        }
        
        for( int x = 0; x<5; x++){
            System.out.println(nomes[x]);
        }
    }

}

*/
