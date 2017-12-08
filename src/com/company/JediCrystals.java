package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class JediCrystals {

    private static int achieveBalance(Scanner sc) throws IOException{

        //Scanner search = new Scanner(new File("01.in"));

        int r = 0;
        int g = 0;
        int b = 0;

        //sc.nextLine();

        String crystalColor = sc.nextLine();

        if (crystalColor.equalsIgnoreCase("r")){
            r++;
        }
        else if (crystalColor.equalsIgnoreCase("g")){
            g++;
        }
        else if (crystalColor.equalsIgnoreCase("b")){
            b++;
        }

        while (!(r==b&&r==g)){

            crystalColor = sc.nextLine();

            if (crystalColor.equalsIgnoreCase("r")){
                r++;
            }
            else if (crystalColor.equalsIgnoreCase("g")){
                g++;
            }
            else if (crystalColor.equalsIgnoreCase("b")){
                b++;
            }
        }

        return r;
    }


    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("01.in"));

        int numOfTestCases = sc.nextInt();
        sc.nextLine();

        for (int testCase=0; testCase < numOfTestCases; testCase++) {
            int answer = achieveBalance(sc);
            System.out.println("Balance achieved at " + answer);
        }

        sc.close();
    }
}

