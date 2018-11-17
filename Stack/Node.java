
public class Node {
    Node next;
    int data;
    public Node(int data){ // yapıcı fonksiyon
        this.data=data;
    }
    public void displayNode() {
        System.out.print(data);
        System.out.print("  ");
    }
}
