package no1_no20;

import java.util.Scanner;

public class 문자열_반복해서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String a = "";

        for(int i = 0; i<n; i++){
            a += str;
        }

        System.out.println(a);


    }
}
