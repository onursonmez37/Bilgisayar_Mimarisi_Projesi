package _21010310076_onur_sönmez;

import java.util.Scanner;

public class _21010310076_Onur_Sönmez {


	static int binary[] = new int[4095];
	static int[] memory = new int[4095];
	static int ortak[] = new int[16];
	static public void binaryDonustur(){ 
	     int index = 0;
	     while(memory[1] > 0){
	       binary[index] = memory[1]%2;
	       memory[1] = memory[1]/2;
	       index++;
	     } 
	}
        static public void binaryDonustur(long sayi){ 
	     int index = 0;
	     while(memory[1] > 0){
	       binary[index] = memory[1]%2;
	       memory[1] = memory[1]/2;
	       index++;
               } 
            
	}
        static public void programCounter( int load, int clear,int increamand){
            
            
      int programcounter=4095;
            binaryDonustur(programcounter);
            System.out.println(programcounter);
    
    }
	public static void main(String[] args) { 
            String sürdürme="E";
            String sart;
            Scanner ab = new Scanner(System.in); do {                
                
            
            System.out.println("Belleğin durumu");
              long deger =4096;
              long programcounter=deger;
               		for(int  i=0; i<memory.length ; i++)
		{
			memory[i]=(int) deger;
			deger--;
		}
	
		binaryDonustur();
		int degisken = 11;
		for(int a=4 ; a<ortak.length;a++)
		{
			
			ortak[a]=binary[degisken];
			degisken--;
		}
		for(int b=0 ; b<ortak.length;b++)
		{
                        
			System.out.print(ortak[b]);
                        
                        
                        
                long programCOunter=ortak[b];
		}            
            String ar="AR";
            String pc="PC";
            String dr="DR";
            String ac="AC";
            String ır="IR";
            String tr="TR";
            String ram="RAM";
            String[] yazaçlar = {"AR", "PC", "DR", "AC", "IR", "TR","RAM"};
            String[] sag_taraf = {"M[AR]", "M[PC]", "M[DR]", "M[AC]", "M[IR]", "M[TR]","M[RAM]"};
            
		//dizi  
            
		Scanner veri  = new Scanner(System.in);
		String solSecim ="";
		int country=4094;//4094 OLMAK ZORUNDA
                System.out.println(" ");
                System.out.print("Lütfen Mikro İşlem Giriniz  :  ");
		String Mislem=veri.next();
                
                String strMetin = Mislem;
                String[] ayırma = strMetin.split("<-");  
        
                    if(ayırma[1].contains("0")){ 
                         System.out.println(ayırma[0]+" clear girişi aktif edildi");
                         System.out.println(ayırma[0]+" değeri sıfırlandı"+" güncel değeri : 0000000000000000");
                         System.out.println(ayırma[0]+" yazacının LD girişi aktif edildi. "+ayırma[0]+" yazacının güncel değeri : ");
                         
                    }
                if(!(ayırma[1].contains("0")&&(!(ayırma[1].contains("+"))))){  // ayırmanın sağ tarafında 0 ve + yoksa 
                         if(ayırma[1].contains("DR")){
                             System.out.println("X3 sinyali 1 yapıldı. ");
                             System.out.println("Mux’ların s2 s1 s0 seçim hatlarına 0 1 1 değeri uygulandı ve "+ayırma[1]+" yazacının değeri veri yoluna aktarıldı.");
                             System.out.println(ayırma[0]+" yazacının LD girişi aktif edildi. "+ayırma[0]+" yazacının güncel değeri : ");
                             
                         }
                         else{
                             if(ayırma[1].contains("PC")){
                             System.out.println("X2 sinyali 1 yapıldı. ");
                             System.out.println("Mux’ların s2 s1 s0 seçim hatlarına 0 1 0 değeri uygulandı ve "+ayırma[1]+" yazacının değeri veri yoluna aktarıldı.");
                            System.out.println(ayırma[0]+" yazacının LD girişi aktif edildi. "+ayırma[0]+" yazacının güncel değeri : ");
                         }
                             else{
                                 if(ayırma[1].contains("AR")){
                                     if(ayırma[1].contains("+")){
                                         System.out.println("AR yazacının INR girişi aktif edildi. AR yazacının güncel değeri:");
                                     }
                                     else{
                            if(ayırma[1].contains("M")){
                            System.out.println("BELLEĞİN READ GİRİŞİ AKTİF EDİLDİ");
                            System.out.println("X7 sinyali 1 yapıldı. ");
                            System.out.println("Mux’ların s2 s1 s0 seçim hatlarına 1 1 1 değeri uygulandı ve "+ayırma[1]+"yazacının değeri veri yoluna aktarıldı.");
                            System.out.println(ayırma[0]+" yazacının LD girişi aktif edildi. "+ayırma[0]+" yazacının güncel değeri : ");
                                     }
                                     else{
                             System.out.println("X1 sinyali 1 yapıldı. ");
                             System.out.println("Mux’ların s2 s1 s0 seçim hatlarına 0 0 1 değeri uygulandı ve "+ayırma[1]+" yazacının değeri veri yoluna aktarıldı.");
                            System.out.println(ayırma[0]+" yazacının LD girişi aktif edildi. "+ayırma[0]+" yazacının güncel değeri : ");
                    }
                                     }}   else{
                                 if(ayırma[1].contains("AC")){
                             System.out.println("X4 sinyali 1 yapıldı. ");
                             System.out.println("Mux’ların s2 s1 s0 seçim hatlarına 1 0 0 değeri uygulandı ve "+ayırma[1]+" yazacının değeri veri yoluna aktarıldı.");
                            System.out.println(ayırma[0]+" yazacının LD girişi aktif edildi. "+ayırma[0]+" yazacının güncel değeri : ");
                    }
                                  else{
                                 if(ayırma[1].contains("IR")){
                             System.out.println("X5 sinyali 1 yapıldı. ");
                             System.out.println("Mux’ların s2 s1 s0 seçim hatlarına 1 0 1 değeri uygulandı ve "+ayırma[1]+" yazacının değeri veri yoluna aktarıldı.");
                            System.out.println(ayırma[0]+" yazacının LD girişi aktif edildi. "+ayırma[0]+" yazacının güncel değeri : ");
                    }
                                 else{
                                 if(ayırma[1].contains("TR")){
                             System.out.println("X6 sinyali 1 yapıldı. ");
                             System.out.println("Mux’ların s2 s1 s0 seçim hatlarına 1 0 1 değeri uygulandı ve "+ayırma[1]+" yazacının değeri veri yoluna aktarıldı.");
                            System.out.println(ayırma[0]+" yazacının LD girişi aktif edildi. "+ayırma[0]+" yazacının güncel değeri : ");
                    }
                                 else{
                                 if(ayırma[1].contains("M")){
                            System.out.println("BELLEĞİN READ GİRİŞİ AKTİF EDİLDİ");
                            System.out.println("X7 sinyali 1 yapıldı. ");
                            System.out.println("Mux’ların s2 s1 s0 seçim hatlarına 1 1 1 değeri uygulandı ve "+ayırma[1]+"yazacının değeri veri yoluna aktarıldı.");
                            System.out.println(ayırma[0]+" yazacının LD girişi aktif edildi. "+ayırma[0]+" yazacının güncel değeri : ");
                    }
                                  else{
                                {
                            System.out.println("YANLIŞ DEĞER GİRİLDİ");
                            
                    }
                                 } }
                    
                
        for (String arrSplit1 : ayırma) {
            System.out.println(arrSplit1); 
        }
                              
        if(ayırma[1].contains("+")){  

        System.out.println(" AR yazacının INR girişi aktif edildi. AR yazacının güncel değeri:");
        if(ayırma[0].equals(yazaçlar[0])){
            
            
            
       
                }
            }          }}    
         
        }}}}
            } while (true);}
        public static int ikilikOnlukDonustur(long sayi)
    {
        int onlukSayi = 0, i = 0;
        long kalan;
        while (sayi != 0)
        {
            kalan = sayi % 10;
            sayi /= 10;
            onlukSayi += kalan * Math.pow(2, i);
            ++i;
        }
        return onlukSayi;
    }

    static void binary(int programcounter) {
        throw new UnsupportedOperationException("Ulaşılamadı"); //To change body of generated methods, choose Tools | Templates.
    }
}
