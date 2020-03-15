package hackerrank.thirtydayschellange.day8;

import java.util.*;
import java.io.*;

public class Solution{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      HashMap<String,Long> phoneBook = new HashMap<>();
      
      int n = in.nextInt();
      for(int i = 0; i < n; i++){
          String name = in.next();
          long phone = in.nextLong();
          phoneBook.put(name, phone);
      }
      while(in.hasNext()){
          String s = in.next();
          String print = phoneBook.containsKey(s)?s+"="+phoneBook.get(s):"Not found";
          System.out.println(print);          
      }
      in.close();
  }
}