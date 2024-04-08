import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class mapdemo{
    void work(){
        SortedMap<String,String> sortedmap=new TreeMap<>();
        sortedmap.put("Key 1","Value 1");
        sortedmap.put("Key 2","Value 2");
        sortedmap.put("Key 3","Value 3");
        System.out.println("Map after adding key-value pairs: "+sortedmap);
        sortedmap.remove("Key 2");
        System.out.println("Map after removing Key 2: "+sortedmap);
    }
}

public class D16_P2 {

    public static void main(String[] args) {
        mapdemo m=new mapdemo();
        m.work();
    }
}