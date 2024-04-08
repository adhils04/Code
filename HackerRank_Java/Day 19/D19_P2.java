import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class D19_P2 {
    public static <T extends Number> T findMin(ArrayList<? extends T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty.");
        }
        
        T min = list.get(0);
        for (T num : list) {
            if (num.doubleValue() < min.doubleValue()) {
                min = num;
            }
        }
        return min;
    }

    public static <T extends Number> T findMax(ArrayList<? extends T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty.");
        }
        
        T max = list.get(0);
        for (T num : list) {
            if (num.doubleValue() > max.doubleValue()) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(15.0);
        numbers.add(10);
        numbers.add(25.5);
        
        Number min = findMin(numbers);
        Number max = findMax(numbers);
        
        System.out.println("Max Element: " + max);
        System.out.println("Min Element: " + min);
    }
}
