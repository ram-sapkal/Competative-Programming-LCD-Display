package com.company;

import java.util.*;

public class LCD {
    public static int row,column,size,column1;
    public static String lcdDisplayBord[][],num;
    public static int number[],n,m,k;

    void setLcdDisplayBoardSize(String n){
        row=2*size+3;
        column=(size+2)*(n.length());
        column1=size+2;
        lcdDisplayBord=new String[row][column];
        number= new int[n.length()];

        for (String[] row : lcdDisplayBord){
            Arrays.fill(row," ");
        }
    }

    void drawStraight(int i, int j){
        k=0;
        n=j;
        m=i;
        while(k<size){
            lcdDisplayBord[m][n]="|";m++;k++;
        }
    }

    void drawHorizontal(int i,int j){
        k=0;
        m=i;
        n=j;
        while(k<size){
            lcdDisplayBord[m][n]="-";n++;k++;
        }
    }

    void printZero(int m){
        drawStraight(1,m);
        drawStraight(2+size,m);
        drawStraight(1,m+column1-1);
        drawStraight(2+size,m+column1-1);
        drawHorizontal(0,m+1);
        drawHorizontal(row-1,m+1);
    }
    void printOne(int m){
        drawStraight(1,m);
        drawStraight(2+size,m);
    }
    void printTwo(int m){
        drawStraight(1,m+column1-1);
        drawStraight(2+size,m);
        drawHorizontal(0,m+1);
        drawHorizontal(1+size,m+1);
        drawHorizontal(row-1,m+1);
    }
    void printThree(int m){
        drawStraight(1,m+column1-2);
        drawStraight(2+size,m+column1-2);
        drawHorizontal(0,m);
        drawHorizontal(1+size,m);
        drawHorizontal(row-1,m);
    }
    void printFour(int m){
        drawStraight(1,m);
        drawStraight(1,m+column1-1);
        drawStraight(2+size,m+column1-1);
        drawHorizontal(1+size,m+1);
    }
    void printFive(int m){
        drawStraight(1,m);
        drawStraight(2+size,m+column1-1);
        drawHorizontal(0,m+1);
        drawHorizontal(1+size,m+1);
        drawHorizontal(row-1,m+1);
    }
    void printSix(int m){
        drawStraight(1,m);
        drawStraight(2+size,m);
        drawStraight(2+size,m+column1-1);
        drawHorizontal(0,m+1);
        drawHorizontal(1+size,m+1);
        drawHorizontal(row-1,m+1);
    }
    void printSeven(int m){
        drawHorizontal(0,m);
        drawStraight(1,m+column1-2);
        drawStraight(2+size,m+column1-2);
    }
    void printEight(int m){
        drawStraight(1,m);
        drawStraight(2+size,m);
        drawStraight(1,m+column1-1);
        drawStraight(2+size,m+column1-1);
        drawHorizontal(0,m+1);
        drawHorizontal(1+size,m+1);
        drawHorizontal(row-1,m+1);
    }
    void printNine(int m){
        drawStraight(1,m);
        drawStraight(1,m+column1-1);
        drawStraight(2+size,m+column1-1);
        drawHorizontal(0,m+1);
        drawHorizontal(1+size,m+1);
        drawHorizontal(row-1,m+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LCD lcd = new LCD();
        size = sc.nextInt();
        num = sc.next();
        while (size != 0 && num != null) {
            lcd.setLcdDisplayBoardSize(num);
            int count = 0;
            for (int i = 0; i < num.length(); i++) {
                number[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
            }

            for (int i = 0; i < num.length(); i++) {
                if (number[i] == 0) {
                    lcd.printZero(count);
                    count = count + column1;
                } else if (number[i] == 1) {
                    lcd.printOne(count);
                    count = count + 1;
                } else if (number[i] == 2) {
                    lcd.printTwo(count);
                    count = count + column1;
                } else if (number[i] == 3) {
                    lcd.printThree(count);
                    count = count + column1 - 1;
                } else if (number[i] == 4) {
                    lcd.printFour(count);
                    count = count + column1;
                } else if (number[i] == 5) {
                    lcd.printFive(count);
                    count = count + column1;
                } else if (number[i] == 6) {
                    lcd.printSix(count);
                    count = count + column1;
                } else if (number[i] == 7) {
                    lcd.printSeven(count);
                    count = count + column1 - 1;
                } else if (number[i] == 8) {
                    lcd.printEight(count);
                    count = count + column1;
                } else if (number[i] == 9) {
                    lcd.printNine(count);
                    count = count + column1;
                }

            }
            for (int k = 0; k < lcdDisplayBord.length; k++) {
                for (int j = 0; j < lcdDisplayBord[k].length; j++) {
                    System.out.print(lcdDisplayBord[k][j]);
                }
                System.out.println();
            }
            size = sc.nextInt();
            num = sc.next();
        }
    }
}
