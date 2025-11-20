package alistirmalar;

import java.util.Scanner;

public class hafta7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int result = yuvarlama(sayi);
        System.out.println("En yakýn 100'ün katýna yuvarlamak için gereken sayý : " + result);

    }

    static int yuvarlama(int x) {
        int sonBsmk = 0;
        int tekrar = 1;
        int eskiX = x;
        while (x > 0) {
            sonBsmk = x % 10;
            x /= 10;
            tekrar *= 10;
        }
        x = (sonBsmk + 1) * tekrar/10;
        int sonuc = x - eskiX;
        return sonuc;
    }

    /* Soru 4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban giriniz");
        int taban = input.nextInt();
        System.out.println("Üs giriniz");
        int us = input.nextInt();
        int result = usBulma(taban, us);
        System.out.println("Sonuç : " + result);

    }

    static int usBulma(int x, int y) {
        int z = x;
        for (int i = 1; i < y; i++) {
            z *= x;
        }
        return z;
    }
     */
 /*Soru 3
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayý giriniz.");
        int sayi1 = input.nextInt();
        int toplam = tamSayilar(sayi1);
        System.out.println("Toplam : " + toplam);

    }

    static int tamSayilar(int x) {
        int toplam = 0;
        for (int i = 1; i < x; i++) {
            toplam += i;
        }
        return toplam;
    }
     */
 /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayýyý giriniz.");
        int sayi1 = input.nextInt();
        System.out.println("2. Sayýyý giriniz.");
        int sayi2 = input.nextInt();
        System.out.println("3. Sayýyý giriniz.");
        int sayi3 = input.nextInt();
        int result = enBuyukBulan(sayi1, sayi2, sayi3);
        System.out.println("En büyük Sayý: " + result);
    }

    static int enBuyukBulan(int x, int y, int z) {
        int enBuyuk;
        if (x > y && x > z) {
            enBuyuk = x;
        } else if (y > z) {
            enBuyuk = y;
        } else {
            enBuyuk = z;
        }
        return enBuyuk;
    }
     */
 /* Soru 1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayý giriniz.");
        int sayi = input.nextInt();
        int result = kupBulma(sayi);
        System.out.println("Girdiðiniz Sayýnýn Küpü: " + result);

    }

    static int kupBulma(int x) {
        x = x * x * x;
        int kup = x;
        return kup;
    }
     */
}
