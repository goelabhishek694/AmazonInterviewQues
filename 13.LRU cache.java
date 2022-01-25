class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next; 
    }

    // public Node(int key, int val){
    //     this.key=key;
    //     this.val=val;
    //     prev=null;
    //     next=null;
    // }

    HashMap<Integer,Node> cache;
    int cap;
    Node head,tail;

    public LRUCache(int capacity) {
         this.cap=capacity;
         cache=new HashMap<>();
    }

    public void addNodeFront(Node node){
        node.next=head.next;
        head.next.prev=node;

        head.next=node;
        node.prev=head;
    }

    public void removeNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;

        node.next=null;
        node.prev=null;
    }

    public Node removeLastNode(){
        Node ln=tail.prev;
        
        ln.prev.next=tail;
        tail.prev=ln.prev;

        ln.next=null;
        ln.prev=null;
        
        return ln;
    }

    public int get(int key) {
        Node res=cache.get(key);
        if(node==null) return -1;
        removeNode(node);
        addNodeFront(node);
        return res.val;
    }
    
    public void put(int key, int value) {
        Node res=cache.get(key);
        Node n=new Node();
        n.key=key;
        n.val=value;
        if(res==null){ //not present 
            if(cache.size()==cap){
            Node lruNode=tail.prev;
            removeNode(lruNode);
            cache.remove(lruNode.key);
            }
            cache.put(key,n);
            addNodeFront(n);
        }
        else{ //is present so just update in cache and move to front
            cache.put(key,n);
            removeNode(res);
            addNodeFront(n);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */ 