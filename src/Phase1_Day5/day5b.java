package Phase1_Day5;
//LeetCode 21. Merge Two Sorted Lists
public class day5b {

        static class ListNode {
            int val;
            ListNode next;

            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode dummy = new ListNode();
            ListNode merge = dummy;

            while(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    merge.next = list1;
                    list1 = list1.next;
                }
                else{
                    merge.next = list2;
                    list2 = list2.next;
                }
                merge = merge.next;
            }
            if(merge.next == list1 && list1 == null){
                merge.next = list2;
            }
            else{
                merge.next = list1;
            }

            return dummy.next;
        }

        public static void main(String[] args) {
            day5b s = new day5b();

            // list1: 1 -> 2 -> 4
            ListNode list1 = new ListNode(1,
                    new ListNode(2,
                            new ListNode(4)));

            // list2: 1 -> 3 -> 4
            ListNode list2 = new ListNode(1,
                    new ListNode(3,
                            new ListNode(4)));

            ListNode result = s.mergeTwoLists(list1, list2);

            // print result
            while(result != null){
                System.out.print(result.val + " ");
                result = result.next;
            }
        }
}
