import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class collectiondemo{
    void display(){
        List<String> list=new LinkedList<String>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        System.out.println("List after adding elements: "+list);
        Set<String> set=new HashSet<>(list);
        set.remove("Element 2");
        List<String> l1=new LinkedList<String>(set);
        Collections.sort(l1);
        System.out.println("Set after removing Element 2: "+l1);
    }
}

public class D16_P1 {

    public static void main(String[] args) {
        collectiondemo c=new collectiondemo();
        c.display();
    }
}