/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab2;

import java.util.Scanner;

/**
 *
 * @author dang
 */
public class Bai4_MayTinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap phep tinh:");
        char op = sc.next().charAt(0);
        double ketQua = 0;
        switch (op) {
            case '+':
                ketQua = a + b;
                break;
            case '-':
                ketQua = a - b;
                break;
            case '*':
                ketQua = a * b;
                break;
            case '/':
                if (b==0) {
                    System.out.println("Khong the chia cho 0");
                    return;
                }
                ketQua = a / b;
                break;
            default:
                System.out.printf("Phep toan khong hop le");
                return;
        }
                System.out.printf("%.2f %c %.2f = %.2f\n",a ,op, b, ketQua);
    }
}
