package day6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

         Scanner scan = new Scanner(System.in);
         int T = scan.nextInt();
         
         for (int j=0; j<T; j++){
        
            String S = scan.next();
            char[] myCharArray = S.toCharArray();

         for (int i = 0; i < S.length(); i++) {
             if (i % 2 == 0){
                 System.out.print(myCharArray[i]);
                 i++;
             }
         }

         System.out.print(" ");

         for (int i = 0; i < S.length(); i++) {
             if (i % 2 == 1) {
                 System.out.print(myCharArray[i]);
                 i++;
             }
         }
         System.out.println();
     
     }
         scan.close();
     
    }
}
