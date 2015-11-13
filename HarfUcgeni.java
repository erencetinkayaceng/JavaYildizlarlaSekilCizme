import java.util.Scanner;


public class HarfUcgeni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, satirSayisi = 10;
		char harf;   // harfleri kullanacağımızdan harf adında char tipinde değişken oluşturuyoruz  
		
		//satırlarımızı oluşturduğumuz for blogumuz
		for (i = 0; i < satirSayisi; i++) {
			
			harf = 'A';   //for her tekrar yaptıgında harf değişkenimize A değerini atıyoruz
			System.out.print((i%10)+" ");   // hangi satırda olduğumuzu göstermek için kullandık
			
			//üçgen şekli elde edebilmemiz için sol tarafda bosluk olusturuyoruz
			for (int j = 0; j < satirSayisi - 1 - i; j++) {
				System.out.print(" ");
			}

			//şimdide harflerimizi yazıdırıyoruz burası A'dan Z'ye kadar artarak giden kısım
			for (int j = 0; j < i ; j++) {   //bulunduğumuz satır kadar harf yazdırıyoruz
				
				System.out.print(harf);
				harf++;
				if (harf >= 'Z') //harf değerimiz eğer Z olursa A ya geri dönüyoruz
					harf = 'A';
			}
			
			harf--; //geri dönüş yapabilmemiz için harf değerini 1 azalttık
			
			//burası Z'den A'ya kadar azalarak giden kısım
			for (int j = 1; j < i ; j++) {  //geri giderken 1 eksik yazmamız gerektiğinden j'yi 1 ile başlattık
				harf--;
				System.out.print(harf);				
				if (harf <= 'A')  //harf değerimiz eğer A olursa Z ye geri dönüyoruz
					harf = 'Z';
			}
			System.out.print("\n");

		}
	}

}