
public class LinkedList {
        private Node first = null;
        public void insert(int data){ // yapıya yeni başına node ekleyen  
             Node n = new Node(data);
             n.next = first;
             first = n;
        }
        public Node delete(){ 
            Node temp = first;
            first = first.next;
            return temp;
        }
        
        public void printList(){ // yapıyı yazdırmaya yarayan fonksiyon
            Node current = first;
            while (current != null) {
                current.displayNode();
                current = current.next;
            }
        }
        public boolean isEmpty() {
            return (first == null);
        }
}
