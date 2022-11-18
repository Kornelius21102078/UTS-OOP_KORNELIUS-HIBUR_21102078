/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsprojek;

/**
 *
 * @21102078_KORNELIUS HIBUR
 */
public class Buku {
    
    private String IDBUK, NAMA, JENIS, JUDUL;
    
    public void SetIDBUK(String idbuk){
        this.IDBUK = idbuk;
    }
    public void SetNAMA(String nama){
        this.NAMA = nama;
    }
    public void SetJENIS(String jenis){
        this.JENIS = jenis;
    }
    public void SetJUDUL(String judul){
        this.JUDUL = judul;
    }
    public String Getidbuk(){
        return this.IDBUK;
    }
    public String Getnama(){
        return this.NAMA;
    }
    public String Getjenis(){
        return this.JENIS;
    }
    public String Getjudul(){
        return this.JUDUL;
    
    }
}
