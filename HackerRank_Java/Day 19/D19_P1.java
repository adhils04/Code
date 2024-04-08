import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Sum<i1 extends Number,i2 extends Number>{
    i1 obj1;
    i2 obj2;
    Sum(i1 obj1,i2 obj2){
        this.obj1=obj1;
        this.obj2=obj2;
        System.out.println("Element 1: "+this.obj1);
        System.out.println("Element 2: "+this.obj2);
        
    }
    public <S extends Number> S sum(){
        if (this.obj1 instanceof Integer && this.obj2 instanceof Double){
        return (S) new Double(this.obj1.intValue()+this.obj2.doubleValue());
    }
    else {
            throw new IllegalArgumentException("Unsupported types");
        }
}
}

public class D19_P1 {

    public static void main(String[] args) {
        Sum<Integer,Double> s1=new Sum<Integer,Double>(10,15.5);
        System.out.println("Sum of Elements: "+s1.sum());
    }
}