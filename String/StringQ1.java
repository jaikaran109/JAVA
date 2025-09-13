//print substring 
//input a = "abcd"
//output  a ab abc abcd ab bc bcd c cd d



public class StringQ1 {
    public static void main(String[] args) {
        String a = "abcd";
        for(int i = 0 ; i <= a.length()-1 ; i++){
            for(int j = i+1 ; j <= a.length() ; j++){
                System.out.print(a.substring(i,j) + "  ");
            }
        }
    }
}
