/**
 *
 * @author Eren Çetinkaya Cruz
 */
public class JavaYildizlarlaSekilCizme2 {
    public static void main(String[] args) {
        
        System.out.print("-------------------Düz üçgen şekli-----------------------\n");  
        
        
     int  uzunluk = 10;
	for (int satir = 0; satir < uzunluk; satir++) {
		System.out.print(satir+" ");// hangi satırda olduğumuzu belirtmek için kullandık
                
                //Önce uzunluktan  bulunduğumuz satırı çıkarıp okadar bosluk sütunu ekliyoruz
                for (int sutun = uzunluk; sutun > satir; sutun--) {
                    System.out.print(" ");
		}
                //Sonra satir sayısı kadar yıldızla sutun çiziyoruz 
		for (int sutun = 0; sutun <= satir; sutun++) {
                    System.out.print("*");
		}
                // Bu for bloguna kadar üçgenin sol tarafını çiziyoruz bundan sonra sağ tarafını
                //satir sayısı kadar yıldızla sütun ekliyoruz
		for (int sutun = 0; sutun < satir; sutun++) {
                    System.out.print("*");
		}
		System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
	}
        
        
        
        
        
        System.out.print("-------------------Ters üçgen şekli-----------------------\n");  
        
        for (int satir = 0; satir < uzunluk; satir++) {
		System.out.print(satir+" ");// hangi satırda olduğumuzu belirtmek için kullandık
                
                //Önce satir sayisi kadar bosluk sütunu ekliyoruz
                for (int sutun = 0; sutun < satir; sutun++) {
                    System.out.print(" ");
		}
                
                //Sonra uzunluktan bulunduğumuz satır sayısını çıkararak yıldız sütununu ekliyoruz
		for (int sutun = uzunluk; sutun > satir; sutun--) {
                    System.out.print("*");
		}
                
                // Bu for bloguna kadar üçgenin sol tarafını çiziyoruz bundan sonra sağ tarafını
                
         	//uzunluktan bulunduğumuz satır sayısını çıkararak yıldız sütununu ekliyoruz
                //-1 şeklin görüntüsünü düzeltmek
                for (int sutun = uzunluk-1; sutun > satir; sutun--) {
                    System.out.print("*");
		}
		System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
	}
        
        
        
        
        
        System.out.print("-------------------Baklava şekli üst kısım-----------------------\n");  
        
        for (int satir = 0; satir < uzunluk; satir++) {
		System.out.print(satir+" ");// hangi satırda olduğumuzu belirtmek için kullandık
                
                //Önce uzunluktan  bulunduğumuz satırı çıkarıp okadar bosluk sütunu ekliyoruz
                for (int sutun = uzunluk; sutun > satir; sutun--) {
                    System.out.print(" ");
		}
                //Sonra satir sayısı kadar yıldızla sutun çiziyoruz 
		for (int sutun = 0; sutun <= satir; sutun++) {
                    System.out.print("*");
		}
                // Bu for bloguna kadar üçgenin sol tarafını çiziyoruz bundan sonra sağ tarafını
                //satir sayısı kadar yıldızla sütun ekliyoruz
		for (int sutun = 0; sutun < satir; sutun++) {
                    System.out.print("*");
		}
		System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
	}
        
        
        
        
        
        System.out.print("-------------------Baklava şekli alt kısım-----------------------\n"); 
         for (int satir = 0; satir < uzunluk; satir++) {
		System.out.print(satir+"  ");// hangi satırda olduğumuzu belirtmek için kullandık
                
                //Önce satir sayisi kadar bosluk sütunu ekliyoruz
                for (int sutun = 0; sutun < satir; sutun++) {
                    System.out.print(" ");
		}
                
                //Sonra uzunluktan bulunduğumuz satır sayısını çıkararak yıldız sütununu ekliyoruz
		for (int sutun = uzunluk; sutun > satir; sutun--) {
                    System.out.print("*");
		}
                
                // Bu for bloguna kadar üçgenin sol tarafını çiziyoruz bundan sonra sağ tarafını
                
         	//uzunluktan bulunduğumuz satır sayısını çıkararak yıldız sütununu ekliyoruz
                //-1 şeklin görüntüsünü düzeltmek
                for (int sutun = uzunluk-1; sutun > satir; sutun--) {
                    System.out.print("*");
		}
		System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
	}
        
        
        
        
        
    }
}
