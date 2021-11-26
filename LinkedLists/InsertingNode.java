
import java.util.*;
class InsertingNode{

    public static void main(String[] args){

LinkedList<String> list = new LinkedList<>();
list.add("hello");
list.addFirst("hellos");

System.out.println(list.size());
for (int i =0; i<list.size(); i++){
   System.out.println(list.get(i));
}

Iterator i = list.iterator();
while(i.hasNext()){
     System.out.println(i.next());
}

    }
}