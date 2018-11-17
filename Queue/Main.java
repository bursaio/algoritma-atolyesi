
public class Main {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.insert(10);
        q.insert(20); // 10,20,30,40 eklencek
        q.insert(30);
        q.insert(40);
        
        q.remove();
        q.remove();  // 10,20,30 çıkarılacak
        q.remove();
        
        q.insert(50);
        q.insert(60); // 50,60,70,80 eklenecek
        q.insert(70);
        q.insert(80);
        
        while(!q.isEmpty()){
            long n=q.remove(); //40,50,60,70,80
            System.out.println(n);
            System.out.println(" ");
        }
        System.out.println("");
    }//main sonnu
}// main sınıfı sonu
