
public class Main {
    public static void main (String [] args){
        LinkedList li=new LinkedList(); 
        li.append(4); // yapıya eleman ekliyoruz
        li.append(5);
        li.append(6);
        li.append(7);
        li.append(8);
        li.printList(); // beklenen çıktı : 4 5 6 7 8 
        System.out.println("**********************");
        li.deletewithValue(8);  
        li.printList(); // beklenen çıktı : 4 5 6 7
        System.out.println("**********************");
        li.prepend(3);
        li.printList(); // beklenen çıktı : 3 4 5 6 7
    }
    
}
