package courses.java.intro;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class MyFirstClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//      define variable
        int x;

        x = 10;
        System.out.println(x);
        boolean isPrime = true;
        System.out.println(isPrime);

        char ch = 'A';
//      constanta e tot immutable
        final double PI = 3.14;
        System.out.println(PI * 12 * 12);
//      string is immutable !!!! dar stringul prin constructie poti sa-i asignezi valoare noua
        String firstName = "Mr. Popescu Ion";
        System.out.println(firstName);
//        ctrl+ /  (comment)
        firstName = "Vasile P";

        System.out.println("division" + (float) 5 / 2);
        System.out.println("Modulo" + 5 % 2);

//      compound - assigment
        x = x + 1;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
//      post-increment
        int y = x++;
//      pre-increment
        int z = ++x;
        System.out.println("y=" + y + " z=" + z);
//      logic operators
//      equal
        System.out.println(z == 22);
//      not equal
        System.out.println(z != 22);

//      condition structure
        if (z == 22 || z < 22) {
            System.out.println("z is less and equal 22");
        } else if (z < 50) {
            System.out.println("z is greater than 22 and less than 50");
        } else {
            System.out.println("z is greater than 50");
        }

        //      multiple conditions
        char letter = 'A';
        switch (letter) {


            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Beer");
                break;
            case 'C':
                System.out.println("Coca-Cola");
            default:
                System.out.println("Not found");

        }

//        number from 10 to n
        int n = Integer.parseInt(args[0]);
        int inc = 10;
        System.out.println("n has value:" + n);

        while (inc<=n){
            System.out.print(inc);
            System.out.print(" ");
         inc++;
        }
        System.out.println("\nNumber with final condition");
        inc = 10;
        do{
            System.out.print(inc);
            System.out.print(" ");
            inc++;
        } while (inc<=n);

        System.out.println("\nOne line while -> for");
        for(int i=10;i<=n;i++){
            System.out.print(i);
            System.out.print(" ");
        }

    }
}

