package Phase1_Day5;
//Leetcode 206. Reverse Linked List

public class day5a {

        static class ListNode {
            int val;
            ListNode next;

            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }

        // PSVM for testing
        public static void main(String[] args) {
            day5a sol = new day5a();

            // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1,
                    new ListNode(2,
                            new ListNode(3,
                                    new ListNode(4,
                                            new ListNode(5)))));

            System.out.println("Original List:");
            printList(head);

            head = sol.reverseList(head);

            System.out.println("Reversed List:");
            printList(head);
        }

        // Helper method to print list
        public static void printList(ListNode head) {
            ListNode curr = head;
            while (curr != null) {
                System.out.print(curr.val + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
}
