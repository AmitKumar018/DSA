// NOT COMPLETED

package hashing;
import java.util.*;
public class HashmapImp {
    static class HashMap<K,V>{   //generic-means any kind of data type is accepted
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
          
        }

        private int n; 
        private int N;      //total no of size
        private LinkedList<Node> buckets[];     //array of linkedlist---buckets
       
        public HashMap(){
           
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i]=new LinkedList<>();
            }
           
            
        }

        private int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%buckets.length;

        }
        public int SearchInLL(K key, int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0; i<ll.size(); i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets=new LinkedList[N*2];
            N=2*N;
            for(int i=0; i<buckets.length; i++){
                buckets[i]=new LinkedList<>();
            }
        }
         
         public void put(K key, V value){
            int bi=hashFunction(key);   //bi-bucket Index
            int di=SearchInLL(key, bi);  //di-data index

            if(di != -1){
                Node node=buckets[bi].get(di);
                node.value=value;

            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda > 2.0){
                rehash();
            }

        }

        public boolean containsKey(K key){
            return false;
        }
    }
    public static void main(String[] args) {
        
    }
}
