public class StringBuilders {   //to improve performance , avoid immutability
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("Hello "); //initial size(capacity) 16
        str.append("World ");      //  + operator does not work 
        System.out.println(str);


        //setCharAt(idx,ch)  -- to change something at that index
        str.setCharAt(0, 'M');
        System.out.println(str);


        //appned -- int,string ,boolean
        str.append(true);
        System.out.println(str);


        //insert (idx,ch)
        //deleteCharAt(idx)


        StringBuilder str1 = new StringBuilder("_Ahish ");
        str1.insert(2,'s');
        System.out.println(str1);
        str1.deleteCharAt(2);
        System.out.println(str1);


        //reverse() 
        StringBuilder sd = new StringBuilder("Reverse");
        System.out.println(sd);
        sd.reverse();
        System.out.println(sd);
        sd.delete(2,4 );
        System.out.println(sd);
    }
}
