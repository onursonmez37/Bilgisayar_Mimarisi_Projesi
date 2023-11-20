# Bilgisayar_Mimarisi_Projesi
öncelik olarak projede mikro işlem sorulduğunda cevap olarak yazılan metin içerisinde boşluk bulunmaması gerekiyor malesef. boşluk olmadığı
durumlarda program sol ve sağ taraf diye ayırdığı mikro işlemi gerekli işlemlere tabi tutuyor.
Program 4096*16 şeklinde hafıza tanımlıyor ve içlerini buna göre doldurma gerçekleştiriyor fakat ortak veriyolu sistemini yapamadığım için
üzerindeki işlemleri gerçekleştiremiyorum. X(i) sinyalleri ve S(i) sinyalleri tablodaki değerlere göre ayarlanmış olup düzgün çıktı sağlıyor

ÖRNEK MİKRO İŞLEMLER VE ÇIKTILARI : </br>
MİKRO İŞLEM : AR<-DR </br>
ÇIKTI : X3 sinyali 1 yapıldı. </br> 
	Mux’ların s2 s1 s0 seçim hatlarına 0 1 1 değeri uygulandı ve DR yazacının değeri veri yoluna aktarıldı. </br>
	AR yazacının LD girişi aktif edildi. AR yazacının güncel değeri :  </br>
MİKRO İŞLEM : DR<-M[AR] </br>
ÇIKTI : BELLEĞİN READ GİRİŞİ AKTİF EDİLDİ </br>
	X7 sinyali 1 yapıldı. </br>
	Mux’ların s2 s1 s0 seçim hatlarına 1 1 1 değeri uygulandı ve M[AR]yazacının değeri veri yoluna aktarıldı. </br>
	DR yazacının LD girişi aktif edildi. DR yazacının güncel değeri :  </br>

MİKRO İŞLEM: AR<-0 </br>
ÇIKTI :	AR clear girişi aktif edildi </br>
	AR değeri sıfırlandı güncel değeri : 0000000000000000 </br>
	AR yazacının LD girişi aktif edildi. AR yazacının güncel değeri :</br> 
