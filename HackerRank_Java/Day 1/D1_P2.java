/*Design a 'Product' class with constructors to initialize product details like name, price, and quantity. Utilize a static member to count the total number of products in the store.

Input Format

Input consists of product details: name, price, and quantity.

Constraints

Display product details and the total count of products after adding each new product.

Output Format

Ensure the price and quantity are non-negative values.

Sample Input 0

"Laptop", $800, 15

Sample Output 0

Product added: Laptop ($800) - Quantity: 15. Total products: 1*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Product {
    public String name;
    public String price;
    public int quantity;
    public static int totalcount = 0;

    public void proddet(String name, String price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalcount++;
        System.out.println("Product added: " + name + " ("+price + ") - Quantity: "+quantity+". Total products: "+totalcount);
    }
}

public class D1_P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product p = new Product();
        String inputLine = input.nextLine();
        String[] arr = inputLine.split(",");
        p.name = arr[0].replaceAll("\"","").trim();
        p.price = arr[1].replaceAll("\"","").trim();
        p.quantity = Integer.parseInt(arr[2].trim());
        p.proddet(p.name,p.price,p.quantity);
    }
}