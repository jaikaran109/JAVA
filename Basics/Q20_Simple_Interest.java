//calculate SI


import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        Double principle=input.nextDouble();
        Double rate=input.nextDouble();
        Double time=input.nextDouble();
        
        Double SI=(principle*rate*time)/100;
        System.out.println("Simple Interest is :"+SI);
    }
}
