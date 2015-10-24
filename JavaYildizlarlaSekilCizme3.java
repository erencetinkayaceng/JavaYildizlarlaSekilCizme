
import java.util.Scanner;

/**
 *
 * @author Eren Çetinkaya Cruz
 */
public class JavaYildizlarlaSekilCizme3 {
     public static void main(String[] args) {
         
         Scanner cr = new Scanner(System.in);

		int sayi, tireSayisi = 1, yildizSayisi = 1, boslukSayisi = 1;
                
		System.out.println("Bir sayı giriniz : ");
		sayi = cr.nextInt();
                
		// ilk satırın tire sayısını bulma
		for (int s = 0; s < sayi - 2; s++) {
			tireSayisi = tireSayisi + 2;
		}
		//ikinci satırın yıldız sayısını bulma
		for (int k = 0; k < sayi - 4; k++) {
			yildizSayisi = yildizSayisi + 2;
		}
                //orta alandaki bosluk sayısını bulma
		for (int n = 0; n < sayi - 6; n++) {
			boslukSayisi = boslukSayisi + 2;
		}
                
		// ilk satırı oluşturuyoruz
                System.out.print("*");
                    for (int j = 0; j < tireSayisi; j++) {
                     System.out.print("-"); //bulduğumuz tire sayısı kadar tire yazdırıyoruz
                    }
		System.out.print("*");
                
		System.out.println();// ikinci satıra geçmek için kullandık

                //ikinci satıra geçiyoruz
		 
			if (sayi > 3) {// sayi 4 veya 4'den büyük ise burası çalışacak
				
					System.out.print(" \\ ");
					for (int j = 0; j < yildizSayisi; j++) {
						System.out.print("*");//ikinci satırı oluşturuyoruz
					}
					System.out.print(" / ");
                                        
				System.out.println();// alt satıra geçmek için kullandık

				//en önemli yer burası çünkü 6 ve 6'dan sonra orta kısımı burası oluşturacak
                                
				for (int m = 0; m < sayi - 5; m++) { //6 dan sonraki her satır için ortayı genişletiyoruz

					for (int j = 0; j < m + 2; j++) {
						System.out.print(" "); 
					}
					System.out.print("\\");
					System.out.print(" ");
					System.out.print("*");
					for (int j = boslukSayisi; j > 0; j--) {
						System.out.print(" ");  //ortadaki boslukları oluşturuyoruz
					}
					System.out.print("*");
					System.out.print(" ");
					System.out.print("/");
					System.out.println();
					boslukSayisi = boslukSayisi - 2;
				}

			}
			if (sayi > 4) {// sayi 5 veya 5'den büyük ise burası çalışacak
				
				for (int i = 0; i < 1; i++) {
					for (int j = 0; j < sayi - 3; j++) {
						System.out.print(" ");
					}
					System.out.print("\\ ");
					System.out.print("*");
					System.out.print(" /");

				}
				System.out.println();

			}
               
                if (sayi > 2) {
			// sayi 3 veya 3'den büyük ise burası çalışacak ve en altın bir üsütünü oluşturacak
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < sayi - 2; j++) {
					System.out.print(" ");
				}
				System.out.print("\\");
				System.out.print(" ");
				System.out.print("/");

			}
			System.out.println();
		}
		//son satırı çiziyoruz
		for (int r = 0; r < sayi-1; r++) {
			System.out.print(" ");
		}
		System.out.print("*");

         
     }
}
