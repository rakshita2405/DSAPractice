class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        // STEP 1: Check if k nodes exist
        ListNode curr = head;
        int count = 0;

        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // If less than k nodes, return as it is
        if (count < k) {
            return head;
        }

        // STEP 2: Reverse first k nodes
        curr = head;
        ListNode prev = null;

        for (int i = 0; i < k; i++) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // STEP 3: Recursively solve remaining list
        ListNode remainingAns = reverseKGroup(curr, k);

        // STEP 4: Connect tail to remaining answer
        head.next = remainingAns;

        return prev;
    }
}