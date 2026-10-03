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
public class Bai2_XepLoaiHocLuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Toan, Ly, Hoa;
        System.out.print("Nhap diem toan: ");
        Toan = sc.nextDouble();
        System.out.print("Nhap diem ly: ");
        Ly = sc.nextDouble();
        System.out.print("Nhap diem hoa: ");
        Hoa = sc.nextDouble();
        if(Toan <0 || Toan >10 || Ly <0 || Ly >10 || Hoa <0 || Hoa >10){
            System.out.print("Diem khong hop le");
            return;
        }
        double DiemTB = (Toan * 2 + Ly + Hoa) / 4;
        String xepLoai;
        if (DiemTB >= 8.0) {
            xepLoai = "Gioi";           
        }else if (DiemTB >= 6.5) {
            xepLoai = "Kha";
        }else if (DiemTB >= 5.0) {
            xepLoai = "Trung binh";
        }else{
            xepLoai = "Yeu";
        }
        System.out.printf("Diem trung binh: %.2f\nXep loai: %s\n",DiemTB,xepLoai);
        
    }
}
