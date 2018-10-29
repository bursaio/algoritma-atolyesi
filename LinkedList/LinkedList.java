
public class LinkedList {
        Node head; // Node sınıfından head nesnesi oluşturduk başka yerlerde de kullanacağımız için üstte tanımladık
        public void append(int data){ // yapıya yeni node ekleyen  
            if(head ==null){ 
                head=new Node(data); // eklenecek data head ise kontrol edip atama yapıyoruz
                return;
            }
            Node current =head; // yapıyı kurmak için current nesnesi oluşturduk
            while (current.next != null){
                current=current.next;
            }
            current.next=new Node(data);
        }
        public void prepend(int data){ // yapının başına yeni head ekleyen fonksiyon
            Node newHead=new Node(data);
            newHead.next=head; //head verisi kaybolmasın diye yeni newHead nesnesi oluşturduk
            head=newHead;
        }
        public void deletewithValue(int data){ // data ile aranan node silmeye yarayan fonksiyon
            if(head==null) return; // yapı boş ise 
            
            if(head.data==data){ // aranan değer head'in datası ise
                head=head.next;
                return;
            }
            Node current=head;
            while(current.next != null){ // aradığımız değeri bulana dek arama yapıyoruz
                if(current.next.data==data){ 
                current.next=current.next.next;
                return;
                }
                current=current.next; // bulana kadar devam
            }        
        }
        public void printList(){ // yapıyı konsolda görmeye yarayan fonksiyon
            Node temp=head; // geçici değişken oluşturup yapının verilerini bozmadan gezmek için oluşturduk
            while(temp !=null){
                System.out.println(temp.data); 
                temp=temp.next;
            }
        }
}
