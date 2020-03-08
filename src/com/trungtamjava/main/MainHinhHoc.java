/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungtamjava.main;

import static com.trungtamjava.baitaphinhhoc.HinhChuNhat.chuViHinhChuNhat;
import static com.trungtamjava.baitaphinhhoc.HinhChuNhat.dienTichHinhChuNhat;
import static com.trungtamjava.baitaphinhhoc.HinhTron.chuViHinhTron;
import static com.trungtamjava.baitaphinhhoc.HinhTron.dienTichHinhTron;
import static com.trungtamjava.baitaphinhhoc.HinhVuong.tinhChuViHinhVuong;
import static com.trungtamjava.baitaphinhhoc.HinhVuong.tinhDienTichHinhVuong;

/**
 *
 * @author Admin
 */
public class MainHinhHoc {

    public static void main(String[] args) {
        double x = 10;
        double y = 5.5;

        System.out.println("chu vi hinh tron : " + chuViHinhTron(x));
        System.out.println("dien tich hinh tron : " + dienTichHinhTron(x));
        System.out.println("chu vi hinh vuong : " + tinhChuViHinhVuong(x));
        System.out.println("dien tich hinh vuong : " + tinhDienTichHinhVuong(x));
        System.out.println("chu vi hinh chu nhat : " + chuViHinhChuNhat(x, y));
        System.out.println("dien tich hinh chu nhat : " + dienTichHinhChuNhat(x, y));
    }
}
