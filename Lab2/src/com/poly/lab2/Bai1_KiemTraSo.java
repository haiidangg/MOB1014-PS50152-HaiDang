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
public class Bai1_KiemTraSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao mot so nguyen: ");
        n = sc.nextInt();
        if(n % 2==0){
            System.out.println("La so chan" + n);           
        }else {
            System.out.println("La so le" + n);
        } 
        if(n>0){
            System.out.println("La so duong" + n);
        }else if (n<0){
            System.out.println("La so am" + n);
        }else{
            System.out.println("Bang 0" + n);
        }
    }
}
