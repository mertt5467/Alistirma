package alistirmalar;

public class hafta6 {
    
    public static void main(String[] args) {
        
        /* Soru 7&8
        int bolunen = 28, bolen = 5, bolum = 0;
        while( bolunen > 0){
        bolunen -= bolen;
        if(bolunen < bolen){
            bolum++;
            break;
        }
        bolum++;
        }
        System.out.println("bölüm: " + bolum);
        System.out.println("kalan: " + bolunen);
        
        
        
        
        
        
        
        /* Soru 6
        int carpan1 = 5;
        int carpan2 = 4;
        int carpim = 0;
        while(carpan2 > 0){
        carpim += carpan1;
        carpan2--;
        }
        System.out.println(carpim);
        
        
        
        
        
        
        
        
        
        
        
        /* Soru 5
        int sayi = 4, bolen = sayi; 
        boolean sayiAsalMi = false;
        while(bolen > 1){
            if(sayi % bolen == 0 && bolen != sayi){
            sayiAsalMi = false;
            break;
            }else{
            sayiAsalMi = true;
            }
            bolen--;
            }
        if(sayiAsalMi == true){
            System.out.println("Sayý Asaldýr.");
        }else{
            System.out.println("Sayý Asal deðildir.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* Soru 4
        int sayi = 1000110, ikiUst = 1, toplam = 0, rakam;
        while(sayi > 0){
        rakam = sayi % 10;
        toplam += rakam*ikiUst;
        sayi /=10;
        ikiUst *=2;
        }
        System.out.println(toplam);
        
        
        
        
        
        
        
        
        /* Soru 3
        int sayi = 7896;
        int bsmk = 0;
        while(sayi > 0){
        bsmk = sayi % 10;
        sayi /= 10;
        }
        System.out.println(bsmk);
        
        
        
        
        
        
        
        
        
        /* Soru 2
        int baslangic = 7, bitis = 17, toplam = 0;
        while(baslangic <= bitis){
            if(baslangic % 2 == 0){
            toplam += baslangic;
            System.out.print(baslangic);
            baslangic++;
            }else{
            baslangic++;
            continue;
            }
            if(baslangic != bitis-1 && baslangic != bitis){
            System.out.print(" + ");
            }
        }
        System.out.println(" = " +toplam);
                
        
        
        
        
        
        /* Soru 1
        int n = 7;
        while(n > 0){
        System.out.print(n + ", ");
        n--;
        }
        */
        
    }
} 

