/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.utsprojek;
import java.util.Scanner;

/**
 *
 * @21102078_KORNELIUS HIBUR
 */
public class UTSprojek {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Buku BUK = new Buku();
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("masukkan id buku : ");
        String ID = dtIN.nextLine();
        BUK.SetIDBUK(ID);
        
        System.out.print("masukkan nama buku : ");
        String NM = dtIN.nextLine();
        BUK.SetNAMA(NM);
        
        System.out.print("jenis : ");
        String JNS = dtIN.nextLine();
        BUK.SetJENIS(JNS);
        
        System.out.print("judul : ");
        String JD = dtIN.nextLine();
        BUK.SetJUDUL(JD);

        System.out.println("id buku : " + ID);
        System.out.println("nama buku : " + NM);
        System.out.println("jenis buku : " + JNS);
        System.out.println("judul buku : " + JD);
        
    }
}