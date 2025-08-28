// Write a Java program to find the number of days in a month. 
// Input a month:- 2 
// Input a year: 2016 
// Expected Output:- February 2016 has 29 days. 





import java.util.Scanner;
public class Q41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter Your Year :");
        int year = input.nextInt();

        System.out.println("Enter Your Month :");
        int month = input.nextInt();

        int feb;
        
        switch(month){
            case 1:
                System.out.println("January "+year+" has :"+31 +" days");
                break;
            case 2:
                if(year %400==0 || (year%100!=0 && year %4==0)){
                    feb = 29;
                }else{
                    feb = 28;
                }
                
                System.out.println("February "+year+" has :"+feb +" days");
                break;
            case 3:
                System.out.println("March "+year+" has :"+31 +" days");
                break;
            case 4:
                System.out.println("April "+year+" has :"+30 +" days");
                break;
            case 5:
                System.out.println("May "+year+" has :"+31 +" days");
                break;
            case 6:
                System.out.println("June "+year+" has :"+30 +" days");
                break;
            case 7:
                System.out.println("July "+year+" has :"+31 +" days");
                break;
            case 8:
                System.out.println("August "+year+" has :"+31 +" days");
                break;
            case 9:
                System.out.println("September "+year+" has :"+30 +" days");
                break;
            case 10:
                System.out.println("October "+year+" has :"+31 +" days");
                break;
            case 11:
                System.out.println("November "+year+" has :"+30 +" days");
                break;
            case 12:
                System.out.println("December "+year+" has :"+31 +" days");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}







//ANOTHER METHOD
// import java.util.Scanner;
// public class Q41 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // Input month and year
//         System.out.print("Input a month (1-12): ");
//         int month = sc.nextInt();
//         System.out.print("Input a year: ");
//         int year = sc.nextInt();
//         int days;
//         switch (month) {
//             case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                 days = 31;
//                 break;
//             case 4: case 6: case 9: case 11:
//                 days = 30;
//                 break;
//             case 2:
//                 // Leap year check
//                 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                     days = 29;
//                 } else {
//                     days = 28;
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid month.");
//                 return;
//         }
//         String[] monthNames = {
//             "", "January", "February", "March", "April", "May", "June",
//             "July", "August", "September", "October", "November", "December"
//         };
//         System.out.println(monthNames[month] + " " + year + " has " + days + " days.");
//     }
// }

