import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class D18_P2 {

    public static void main(String[] args) {
        TreeSet set=new TreeSet<>(new mycomparator());
        set.add("Element 1");
        set.add("Element 2");
        set.add("Element 3");
        System.out.println("TreeSet after adding elements: "+set);
        System.out.println("Sorted TreeSet using custom Comparator: "+set);
    }
}

class mycomparator implements Comparator<String>{
    public int compare(String s1,String s2){
        return s1.compareTo(s2);
    }
}