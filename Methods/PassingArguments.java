public class Methods_PassingArguments {

    public static void greet(String name){
        System.out.println("Good Morning ");
    }

    public static void sum(int a , int b){
        System.out.println(a+b);
    }

    public static void intro(String name,int age){
        System.out.println("Hello "+name+"Your Age is "+age);
    }

    public static void main(String[] args) {
        greet("jaikaran");  
        greet("Anshu ");
        greet("Aaru ");

        sum(13,234);

        intro("jai",20); //order of passing arg matters 
    }
}
