class Solution {

    public int countGoodSubstrings(String s) {

        int count = 0;

        for(int i = 0; i <= s.length() - 3; i++) {

            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            if(a != b && b != c && a != c)
                count++;
        }

        return count;
    }
}




// FOR K 
// int count = 0;
// for(int i = 0 ; i < s.length() - k; i++){
//   HashSet<Character> set = new HashSet<>();
//   boolean dist = true;
//   for(int j = i ; j < i + k ; j++){
//     if(set.contains(s.charAt(j)){
//       dist = false;
//       break;
//     }
//     set.add(s.charAt(j));
//   }
//   if(dist)count++;
// }
// return count;
