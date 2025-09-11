import java.util.Scanner;
public class Methods_Syntax {
    public static void main(String[] args)   {   //main function 
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();


        //built in functions
        System.out.println(Math.pow(a,b));
        System.out.println(Math.sqrt(8)); // square root
        System.out.println(Math.cbrt(1000)); // cube root
        System.out.println(Math.abs(-3279));  // absolute
        System.out.println(Math.floor(-3.24)); // return integer
        System.out.println(Math.max(32,2342));  //return max
        System.out.println(Math.min(123,2143)); //return min 

        //Max among 3
        System.out.println(Math.max(234,Math.max(12,5324)));

        fun1();  // call function 1
    }
    public static void fun1(){  // function 1
        System.out.println("Hey Anu ");
        fun2();  // call function 2
    }

    public static void fun2(){ //function 2
        System.out.println("oyye anshu ");
        fun3();  // call function 3
    }

    public static void fun3(){  //function 3
        System.out.println("Anshika  shitttttttt...");
    }
}
