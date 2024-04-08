import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class genericdemo {
    public static <S extends Number> S findMin(ArrayList<? extends S> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        S min = list.get(0);
        for (S num : list) {
            if (num.doubleValue() < min.doubleValue()) {
                min = num;
            }
        }
        return min;
    }

    public static <S extends Number> S findMax(ArrayList<? extends S> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        S max = list.get(0);
        for (S num : list) {
            if (num.doubleValue() > max.doubleValue()) {
                max = num;
            }
        }
        return max;
    }
}

public class D20_P1 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(20.0);
        numbers.add(10);
        numbers.add(25.5);
        numbers.add(15.0);
        genericdemo g = new genericdemo();
        Number minimum = g.findMin(numbers);
        Number maximum = g.findMax(numbers);
        System.out.println("Max Element: " + maximum);
        System.out.println("Min Element: " + minimum);
    }
}