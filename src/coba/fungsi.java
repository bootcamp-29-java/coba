/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author ASUS
 */
public class fungsi {
    float a, b, c, d;
    void pengurangan (){
        float hasil = a-b;
        System.out.println(a +" - " +b +" = " +hasil);
    }
    
    float pengurangan(float x, float y){
        return x-y;
    }
    
    void penjumlahan (){
        float hasil = a+b;
        System.out.println(a +" + " +b +" = " +hasil);
    }
    
    float penjumlahan(float x, float y){
        return x+y;
    }
    
    void perkalian (){
        float hasil = a*b;
        System.out.println(a +" x " +b +" = " +hasil);
    }
    
    float perkalian(float x, float y){
        return x*y;
    }
    
    void peembagian (){
        float hasil = a/b;
        System.out.println(a +" : " +b +" = " +hasil);
    }
    
    float pembagian(float x, float y){
        return x/y;
    }
}
