/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        // Map original node → cloned node
        Map<Node, Node> map = new HashMap<>();
        
        // First pass: create clone nodes (without correct pointers yet)
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        
        // Second pass: assign next & random pointers
        curr = head;
        while (curr != null) {
            Node clone = map.get(curr);
            clone.next = map.get(curr.next);        // maybe null if curr.next is null
            clone.random = map.get(curr.random);    // maybe null
            curr = curr.next;
        }
        
        return map.get(head);
    }
}
