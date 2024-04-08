import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Simpleclass implements Cloneable {
    public int id;
    public String name;

    Simpleclass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class D9_P1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        Simpleclass s = new Simpleclass(1, "Original Object");
        System.out.println("Original Object: ID: " + s.id + ", Name: " + s.name);
        Simpleclass s1 = (Simpleclass) s.clone();
        System.out.println("Cloned Object: ID: " + s1.id + ", Name: " + s1.name);
    }
}
