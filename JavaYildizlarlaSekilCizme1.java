
/**
 *
 * @author Eren Çetinkaya Cruz
 */
public class JavaYildizlarlaSekilCizme1 {

   public static void main(String[] args) {
       
         System.out.print("-------------------Sola dayalı ucgen şekli-----------------------\n");  
        
//    Sola dayalı ucgen şekli
//    0 
//    1 *
//    2 **
//    3 ***
//    4 ****
//    5 *****
//    6 ******
//    7 *******
//    8 ********
//    9 *********   
        int  uzunluk = 10;
	for (int satir = 0; satir < uzunluk; satir++) {
		System.out.print(satir+" ");// hangi satırda olduğumuzu belirtmek için kullandık
                
                // satir sayısı kadar yıldızla sütun ekliyoruz
		for (int sutun = 0; sutun < satir; sutun++) {
                    System.out.print("*");
		}
		System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
	}

        
        
       
       System.out.print("-------------------Sağ dayalı ucgen şekli-----------------------\n");   
        
//      Sağ dayalı ucgen şekli       
//      0           
//      1          *
//      2         **
//      3        ***
//      4       ****
//      5      *****
//      6     ******
//      7    *******
//      8   ********
//      9  *********
	for (int satir = 0; satir < uzunluk; satir++) {
                 System.out.print(satir+" ");// hangi satırda olduğumuzu belirtmek için kullandık
		
                //Önce uzunluktan  bulunduğumuz satırı çıkarıp okadar bosluk sütunu ekliyoruz
                for (int sutun = uzunluk; sutun > satir; sutun--) {
                    System.out.print(" ");
		}
                //Sonra satir sayısı kadar yıldızla sutun çiziyoruz
		for (int sutun = 0; sutun < satir; sutun++) {
                    System.out.print("*");
		}
		System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
	}
        
        
        
        
        
        System.out.print("-------------------Sola dayalı ters ucgen şekli-----------------------\n");   
        
//        Sola dayalı ters ucgen şekli
//        0 **********
//        1 ********* 
//        2 ********  
//        3 *******   
//        4 ******    
//        5 *****     
//        6 ****      
//        7 ***       
//        8 **        
//        9 *
        for (int satir = 0; satir < uzunluk; satir++) {
                 System.out.print(satir+" ");// hangi satırda olduğumuzu belirtmek için kullandık
		
                //uzunluktan bulunduğumuz satır sayısını çıkararak yıldız sütununu ekliyoruz
                for (int sutun = uzunluk; sutun > satir; sutun--) {
                    System.out.print("*");
		}
               
		System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
	}
        
        
        
        
        
        
        
        System.out.print("-------------------Sağ dayalı ters ucgen şekli-----------------------\n"); 
        
//      Sağ dayalı ters ucgen şekli
//      0 **********
//      1  *********
//      2   ********
//      3    *******
//      4     ******
//      5      *****
//      6       ****
//      7        ***
//      8         **
//      9          *
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
		System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
	}
    }
  
}
