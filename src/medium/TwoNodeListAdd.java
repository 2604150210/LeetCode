package medium;

/**
 * Created by jal on 2017/12/30 0030.
 */
public class TwoNodeListAdd {
    //Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    static class Solution {
        public static int c;
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            c = 0;
            if(l1.val == 0 && l1.next == null && l2.val == 0 && l2.next == null){
                ListNode root = new ListNode(0);
                root.next = null;
                return root;
            }
            ListNode root = addList(l1,l2);
            return root;

        }

        public static ListNode addList(ListNode list1, ListNode list2){
            if(list1 == null && list2 == null){
                if(c == 0){
                    return null;
                }else{
                    ListNode root = new ListNode(c);
                    root.next = null;
                    return root;
                }
            }
            else if(list1 == null && list2 != null){
                int sum = c + list2.val;
                c = sum / 10;
                ListNode root = new ListNode(sum % 10);
                if(c == 0){
                    root.next = list2.next;
                }else{
                    ListNode left = new ListNode(0);
                    left.next = null;
                    root.next = addList(left,list2.next);
                }
                return root;
            }
            else if(list1 != null && list2 == null){
                int sum = c + list1.val;
                c = sum / 10;
                ListNode root = new ListNode(sum % 10);
                if(c == 0){
                    root.next =list1.next;
                }else{
                    ListNode left = new ListNode(0);
                    left.next = null;
                    root.next = addList(left,list1.next);
                }
                return root;
            }
            int a = list1.val;
            int b = list2.val;
            int sum = a + b + c;
            c = sum / 10;
            ListNode root = new ListNode(sum % 10);
            root.next = addList(list1.next,list2.next);
            return root;
        }
    }
}
