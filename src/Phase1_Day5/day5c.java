package Phase1_Day5;
//LeetCode 141 LinkedList Cycle
public class day5c {

        static class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
        }

        public boolean hasCycle(ListNode head) {

            if(head == null){
                return false;
            }

            ListNode slow = head;
            ListNode fast = head.next;

            while(slow != null || fast != null){
                if(fast == null || fast.next == null){
                    return false;
                }
                if(fast == slow){
                    return true;
                }
                slow = slow.next;
                fast = fast.next.next;
            }

            return false;
        }

        public static void main(String[] args) {
            day5c s = new day5c();

            // create nodes
            ListNode head = new ListNode(3);
            ListNode n1 = new ListNode(2);
            ListNode n2 = new ListNode(0);
            ListNode n3 = new ListNode(-4);

            // link list: 3 -> 2 -> 0 -> -4
            head.next = n1;
            n1.next = n2;
            n2.next = n3;

            // create cycle: -4 -> 2
            n3.next = n1;

            boolean result = s.hasCycle(head);
            System.out.println(result); // true
        }
}
