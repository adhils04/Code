import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class iteratordemo{
    void display(){
    ArrayList<String> list=new ArrayList<>();
    list.add("Element 1");
    list.add("Element 2");
    list.add("Element 3");
    System.out.println("ArrayList after adding elements: "+list);
    Iterator<String> iter=list.iterator();
    System.out.print("Iterating using Iterator: ");
    int len=list.size();
    while(iter.hasNext()){
        System.out.print(iter.next());
        len-=1;
        if (len!=0){
            System.out.print(", ");
        }
    }
    System.out.println();
    System.out.print("Iterating using For-Each loop: ");
    len=list.size();
    for (String i:list){
        System.out.print(i);
        len-=1;
        if (len!=0){
            System.out.print(", ");
        }
    }
    }
}

public class D18_P1 {

    public static void main(String[] args) {
        iteratordemo i=new iteratordemo();
        i.display();
    }
}