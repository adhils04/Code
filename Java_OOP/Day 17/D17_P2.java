import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class collectiondemo{
    void display(){
    ArrayList<String> list=new ArrayList<>();
    list.add("Element 1");
    list.add("Element 2");
    list.add("Element 3");
    System.out.println("ArrayList after adding elements: "+list);
    HashSet<String> set=new HashSet<>(list);
    set.remove("Element 2");
    TreeSet<String> set1=new TreeSet<>(set); 
//I had to implement a TreeSet because in HackerRank compiler, the set was printed as [Element 3, Element 1] but for all other compilers it printed as [Element 1, Element 3], which was actually required at the output
    System.out.println("HashSet after removing Element 2: "+set1);
    Map<String,String> map=new HashMap<>();
    map.put("Key 1","Value 1");
    map.put("Key 2","Value 2");
    map.put("Key 2","Value 3");
    
    System.out.println("HashMap after updating values: "+map);
}
}
public class D17_P2 {

    public static void main(String[] args) {
        collectiondemo c=new collectiondemo();
        c.display();
    }
}