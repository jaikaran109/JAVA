class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while(left < right && list.get(left) == list.get(right)){
            left++;
            right--;
        }
        return left >= right;
    }
}




// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         List<Integer> list = new ArrayList<>();
//         while(head != null){
//             list.add(head.val);
//             head = head.next;
//         }
//         int l = 0;
//         int r = list.size() - 1;
//         while(l < r){
//             if(list.get(l) != list.get(r)) return false;
//             l++;
//             r--;
//         }
//         return true;
//     }
// }
