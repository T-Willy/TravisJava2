import java.util.*; 
import java.util.Scanner;
import java.util.Random; 
import java.util.Arrays;
import java.util.Collections;
import java.lang.String;
import java.io.*;
import java.util.Hashtable;


public class HW6Q4T
      
{
public static String repeat(String str, int times){

return new String(new char[times]).replace("\0", str);
}
      
   public static void main(String[] args){
 
 Hashtable<String, Integer> frequencies = new Hashtable<String, Integer>();
    {
  
 String paragraph = "I would like you all to know that I have been working on this programming thing for far too long. Java is complex and can be hard to learn; however, we continue on. I'm really just typing this so that I can create something with 100 characters. I can probably stop because I confused characters with words, and 100 characters is far fewer than 100 words.";
 //String[] paragraph = new String[] {"I would like you all to know that I have been working on this programming thing for far too long. Java is complex and can be hard to learn; however, we continue on. I'm really just typing this so that I can create something with 100 characters. I can probably stop because I confused characters with words, and 100 characters is far fewer than 100 words."};
 
 // char[] alpha = new char[26];
 // int [] frequencies = new int [26];//{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u ,v ,w, x ,y, z};
  int index = 0;
  char c = 'a';
      for(int i = 0; i < 26; i++){
      
                frequencies.put((c+""), 0); 
              
                c++;
             //   System.out.println(alpha[i]);
            }



     for(int j = 0; j < paragraph.length() ; j++)
  {
     // frequencies[j] = 0;
   //char a = paragraph.charAt(j);
    if(paragraph.charAt(j) == ' ') continue;
         char l = paragraph.charAt(j); 
         int v = frequencies.get(l+"");
          frequencies.put((l+""), v++);
         //if(paragraph.charAt(j) == alpha[j]){ 
         //frequencies[j]++;
}
System.out.println(frequencies);
}}
//
        
  

   
}


