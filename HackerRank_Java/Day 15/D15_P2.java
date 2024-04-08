import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class collectiondemo{
    public void display(){
    List<String> list = new LinkedList<String>();
    list.add("Element 1");
    list.add("Element 2");
    list.add("Element 3");
    System.out.println("List after adding elements: "+list);
    Set<String> set=new HashSet<>(list);
    set.remove("Element 2");
    System.out.println("Set after removing Element 2: "+set);
    
    Map<String,String> map=new HashMap<>();
    map.put("Key 1","Value 1");
    map.put("Key 2","Value 2");
    map.put("Key 3","Value 3");
    map.put("Key 2","Value 3");
    System.out.println("Map after updating values: "+map);
        }
}


public class D15_P2 {

    public static void main(String[] args) {
        collectiondemo c=new collectiondemo();
        c.display();
    }
}