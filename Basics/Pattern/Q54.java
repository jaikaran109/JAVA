// Q:-54 Print the following Pattern.

//     *
//    ***
//   *****
//  *******
// *********




// VIA WHILE LOOOP
// public class Q54 {
//     public static void main(String[] args) {
//         int n = 5 ; 
//         int space = n - 1 ; 
//         int star = 1 ;
        
//         int i = 1 ; 
//         while(i <= n)
//         {
//             int k  = 1;
//             while(k <= space)
//             {
//                 System.out.print("  ");
//                 k++ ;
//             }
//             int j = 1 ; 
//             while(j <= star)
//             {
//                 System.out.print("* ");
//                 j++ ;
//             } 
//             star+=2 ;
//             space-- ;
//             System.out.println();
//             i++ ;
//         }
//     }
// }




// // Via for loop
public class Q54 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for(int j = 5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
