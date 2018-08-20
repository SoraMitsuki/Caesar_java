/**Jiaqi Fan 
A12584051
cse8b
1/8/201
**/

// Keep these two lines.  They are what tell Java to include the
// classes you need for working with files.
// You might get warnings about them at first.  That's OK, just
// ignore the warnings.  They should go away as you complete your code.
import java.io.*;
import java.util.*;

/** Jiaqi Fan A12584051 1/8/2016
 * caesar.java This program will translate a message in the form of a 
 * sequence of characters from 
 * ciphertext to plaintext. In other word this program will shift a 
 * letter around toother letter. 
 * */
public class Caesar {
 // Complete the methods below.  Be sure to add header
 // comments for each. You may (and should) also write additional
 // helper methods.  Be sure to make the helper methods private and include
 // header comments for each.

 // Although you will not be graded on style this week, you should follow
 // these basic style guidelines nonetheless.   You will be graded on this
 // in weeks to come, so start to practice now.

 // Use proper indenting: Indent each block of code (e.g., method body,
 //   loop body.  Line up the lines in the block so that they are all
 //   indented to the same degree.  See examples of this in the book
 //   and in the code below.
 // Use descriptive variable names: The names of your variables should
 //   describe the data they hold.  Almost always, your variable names
 //   should be words (or abbreviations), not single letters.
 // Write short methods: Break your methods up into submethods if they
 //   are getting too complicated or long.  Generally your methods
 //   shouldn't get too much longer than about 20 lines of code (give or take)
 // Write short lines: Each line of code should be no longer than 80
 //   characters, so it can fit in a reasonable size window.  There's a
 //   column number in both vim and emacs.
 //
 // We'll start with these, as these are the most important.  We may add
 // to this list later in the term, but if you do all of the above you're
 // in good shape.

/*
  * Name:       encrypt
  * Purpose:    translate plaintext into ciphertext
  * Parameters: String s, a string of text
  *             int rotation an integer that will rotate 
  * Return:     String
  */
 public static String encrypt(String s, int rotation) {
  // letters are between 65 and 90 (Upper Case) and 97 and 122 (Lower Case)
   String encrypt = "";
   for (int i = 0; i < s.length(); i++)
   {
     int character = s.charAt(i);
     if(character >= 65 && character <=90)
     {
         character = character + (rotation%26);
       if (character > 90)
         character = character - 26;
     }
     else if (character >= 97 && character <= 122)
       {
           character = character + (rotation%26);
         if (character > 122 )
           character = character - 26;
       }
      encrypt += (char)character;
     }
      return encrypt;
   }
  
 /*
  * Name:       decrypt
  * Purpose:    translate ciphertext into plaintext
  * Parameters: String s, a string of text
  *             int rotation an integer that will rotate 
  * Return:     String
  */
 public static String decrypt(String s, int rotation) {
   String decrypt = "";
   for (int i = 0; i < s.length(); i++)
   {
     int character = s.charAt(i);
     if(character >= 65 && character <=90)
     {
         character = character - (rotation % 26);
       if (character < 65)
         character = character + 26;
     }
     else if (character >= 97 && character <= 122)
       {
           character = character - (rotation % 26);
         if (character < 97 )
           character = character + 26;
         else if (character > 122)
           character = character - 26;
       }
      decrypt += (char)character;
     }
  return decrypt;
 }

 /*
  * Name:       letterOperation
  * Purpose:    translate an alphabet into other letter
  * Parameters: char a one character  
  *             int rotation an integer for number of shift
  * Return:     String
  */
 private static char letterOperation(char a, int rotation) {
  if (a >= 'A' && a <= 'Z')
     a = (char)((int)a + (rotation % 26));
       if (a > 'Z')
         a = (char)((int)a - 26);
  else if (a >= 'a' && a <= 'z')
       {
           a = (char)((int)a + (rotation % 26));
         if (a > 'z' )
           a = (char)((int)a - 26);
         else if (a < 'a')
           a = (char)((int)a + 26);
       }
  return a;
 }
}
