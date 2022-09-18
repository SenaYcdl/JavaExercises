package StatementsReplit;

import java.util.Enumeration;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        //pascal ucgeni

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of the lines:");
        int lines=scan.nextInt();

        int i,j,k,number;

        for (i=0; i<lines; i++) {

            for (k=lines;k>i; k--)
                System.out.print(" ");
                number=1;

                for (j=0;j<=i;j++){
                    System.out.print(number + " ");
                    number=number * (i-j) / (j +1);
                }

            System.out.println();
            }
        }

    }
