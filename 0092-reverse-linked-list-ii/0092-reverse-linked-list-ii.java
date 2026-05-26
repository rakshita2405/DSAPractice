
class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        for (int i = 1; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode last = prev;
        ListNode newEnd = curr;

        ListNode next = null;

        for (int i = 0; i < right - left + 1; i++) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = curr;

        return head;
    }
}

