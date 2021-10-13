package com.xxxx.git;

import java.util.Scanner;

/**
 * @Author: DarrenLin
 * @Date: 2021/10/12 12:04
 * @Description:
 */
public class MyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("please input three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((a>=1 && a<=100) && (b>=1 && b<=100) && (c>=1 && c<=100)){
                if (a+b>c && a+c>b && b+c>a){
                    if (a==b && a==c){
                        System.out.println("等边三角形");
                    } else if(a==b || a==c || b==c){
                        System.out.println("等腰三角形");
                    } else {
                        System.out.println("不等边三角形");
                    }
                } else {
                    System.out.println("非三角形");
                }
            } else {
                System.out.println("数值范围需在1-100");
            }

        }
    }
}
