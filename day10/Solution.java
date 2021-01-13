package day10;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder;
        int numOfOnes=0;
        int totalConsOnes=0;
        while (n > 0) {
            remainder = n % 2;
            n = n / 2;
            if (remainder == 1) {
                numOfOnes++;
                if (numOfOnes >= totalConsOnes)

                    totalConsOnes = numOfOnes;

            } else {

                numOfOnes = 0;
            }
        }

        System.out.println(totalConsOnes);
                
            in.close();
        }

        
    }
