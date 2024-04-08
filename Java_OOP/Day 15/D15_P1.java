import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class D15_P1 {

    public static void main(String[] args) {
        Collection<String> list=new LinkedList<String>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        System.out.println("Collection after adding elements: "+list);
        list.remove("Element 2");
        System.out.println("Collection after removing Element 2: "+list);
        Iterator<String> it=list.iterator();
        System.out.println("Iterating over the collection:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}