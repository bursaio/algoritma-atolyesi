
public class Stack {

    LinkedList li = new LinkedList(); 
    public void push(int data) {
        li.insert(data);
    }

    public void pop() {
        if(!li.isEmpty()){
            li.delete();
        }
    }
    
    public void displayStack() {
        System.out.println("  ");
        li.printList();
    }
}
