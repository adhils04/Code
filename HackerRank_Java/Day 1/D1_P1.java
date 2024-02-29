/*Write a Java program to manage a library's book inventory. Implement a class 'Book' with static member variables to keep track of the total number of books and individual book details

Input Format

Input includes book details: title, author, and publication year.

Constraints

Ensure the publication year is a positive integer.

Output Format

Display book details and the total count of books in the library after adding each book.

Sample Input 0

"1984", "George Orwell", 1949

Sample Output 0

Book added: 1984 by George Orwell (1949). Total books: 1*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Book {
    public String title;
    public String author;
    public int year;
    public static int totalbooks = 0;

    public void bookdetails(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        totalbooks++;
        System.out.println("Book added: " + title + " by" + author + " (" + year + "). Total books: " + totalbooks);
    }
}

public class D1_P1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book b1 = new Book();
        String inputLine = input.nextLine();
        String[] arr = inputLine.split(",");
        b1.title = arr[0].replaceAll("\"","");
        b1.author = arr[1].replaceAll("\"","");
        b1.year = Integer.parseInt(arr[2].trim());
        b1.bookdetails(b1.title, b1.author, b1.year);
    }
}