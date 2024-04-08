import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface Functions<T extends Number> {
    T findMax(ArrayList<? extends T> list);
    T findMin(ArrayList<? extends T> list);
}

class GenericClass<T extends Number> implements Functions<T> {
    GenericClass(List<? extends T> list) {
        
    }

    public T findMax(ArrayList<? extends T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        T max = list.get(0);
        for (T num : list) {
            if (num.doubleValue() > max.doubleValue()) {
                max = num;
            }
        }
        return max;
    }

    public T findMin(ArrayList<? extends T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        T min = list.get(0);
        for (T num : list) {
            if (num.doubleValue() < min.doubleValue()) {
                min = num;
            }
        }
        return min;
    }
}

public class D20_P2 {
    public static void main(String[] args) {
        List<Number> l = new ArrayList<>();
        l.add(10);
        l.add(25.5);
        l.add(20.0);
        l.add(15.5);
        
        GenericClass<Number> genericObject = new GenericClass<>(l);
        Number min = genericObject.findMin(new ArrayList<>(l));
        Number max = genericObject.findMax(new ArrayList<>(l));

        System.out.println("Max Element: " + max);
        System.out.println("Min Element: " + min);
        System.out.println("Interface Method: [Functionality]");
    }
}
