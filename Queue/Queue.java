
public class Queue {
    
    int maxSize;
    long [] queArray;
    int front;
    int rear;
    int nItems;
    public Queue(int s){ //constructor
        maxSize=s; // array boyutu 1 büyüdü
        queArray=new long[maxSize]; 
        front=0;
        rear=-1;
        nItems=0;
    }
    public void insert(long j){ // kuyruğun sonuna eleman ekleme
        if(rear==maxSize-1){
            rear=-1;
        }
        queArray[++rear]=j;// arkayı arttır ve ekle
        nItems++; // 1 eleman daha
    }
    
    public long remove(){ // kuyruğun önünden eleman çıkarma
        long temp=queArray[front++]; // değeri ver ve önü arttır
        if(front==maxSize){
            front=0;
        }
        nItems--;//1 eleman azaltır
        return temp;
    }
    public long peek(){//kuyruğun başındaki elemanı gösterir
        return queArray[front];
    }
    public boolean isEmpty(){ //kuyruk boş ise true
        return (nItems==0);
    }
    public boolean isFull(){ //kuyruk dolu ise true
        return (nItems==maxSize);
    }
    public int size(){ // kuyruğun eleman sayısını verir
            return nItems;

    }
        
}//kuyruk sınıfının sonu
