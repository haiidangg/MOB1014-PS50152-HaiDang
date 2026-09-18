/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai4_HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chieuDai, chieuRong, cv , dt;
        
        System.out.print("Nhap chieu dai: ");
        chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieuRong = sc.nextDouble();
        
        cv = 2 * (chieuDai + chieuRong);
        dt = chieuDai * chieuRong;
        
        System.out.printf("Chieu dai: %.2f\nChieu rong: %.2f\nChu vi hinh chu nhat: %.2f\nDien tich hinh chu nhat:%.2f",chieuDai,chieuRong, cv, dt);
    }
}