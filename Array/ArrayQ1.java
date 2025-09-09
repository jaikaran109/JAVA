//Given a array of marks of students,if the marks of any student
//  is less than 50 print it's roll no.[Roll no. here refers the index of array ]


public class ArraysQ1 {
    public static void main(String[] args) {
        int[] marks = {100,96,35,45,97,98,94,99};
        for(int i = 0;i<marks.length;i++){
            if(marks[i] < 50){
                System.out.print(marks[i]+"  "); // for marks
                System.out.print(marks[i]+"  "); // for index
            }
        }
    }
}
