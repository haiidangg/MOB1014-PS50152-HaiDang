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
public class Bai3_MuaTrongNam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        int Thang = sc.nextInt();
        switch (Thang) {
            case 1,2,3:
                System.out.println("Thang " + Thang + ": Mua xuan");
                break;
            case 4,5,6:
                System.out.println("Thang " + Thang + ": Mua ha");
                break;
            case 7,8,9:
                System.out.println("Thang " + Thang + ": Mua thu");
                break;
            case 10,11,12:
                System.out.println("Thang " + Thang + ": Mua dong");
                break;
            default:
                System.out.printf("Thang khong hop le");
                break;
        }
    }
}
