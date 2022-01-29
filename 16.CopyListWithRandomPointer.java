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
        createCopy(head);
        createRandomPointer(head);
        Node head2=head.next;
        divideLL(head,head2);

        return head2;
    }

    public Node createCopy(Node head){
        Node node=head;
        while(node!=null){
            Node nnode=new Node(node.val);

            nnode.next=node.next;
            node.next=nnode;

            node=nnode.next;
        }
        return head;
    }

    public Node createRandomPointer(Node head){
        Node node=head;
        while(node!=null){
            if(node.random!=null){
                node.next.random=node.random.next;
            }
            
            node=node.next.next;
        }
        return head;
    }

    public Node divideLL(Node head, Node head2){
        Node h1=head;
        Node h2=head2;
        Node a=h2.next;
        while(a!=null ){
            h2.next=a.next;
            h2=h2.next;
            a=h2.next;
        }
    }
}