// Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Ilk Sayiyi Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("Lutfen Ikinci Sayiyi Giriniz : ");
        int n2 = input.nextInt();
        System.out.println();

        int i = 1, ebob = 1, ekok = 1;

        // İlk olarak kullanıcının sayılara 0 veya eksi bir değer girmesini istemediğimden if atıyorum.

        if (n1 > 0 && n2 > 0) {

            // Matematiksel olarak ebob'un max değeri girilen sayılardan küçüğüdür. Küçük sayının üstünden işlemlerimizi yapacağımız için onu buluyoruz.

            if (n1 < n2) {

                // Eğer girilen ilk sayı küçükse, bir i sayısı oluşturup ona 1 değerini vererek döngüde arttırıyoruz. Daha sonra bu girilen sayılar bu i değerlerine bölünerek sonucun ikisindede 0 çıktığı en büyük sayı bulunuyor.

                while (i <= n1) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        ebob = i;
                    }
                    i++;
                }
            } else {

                // Burada girilen ikinci sayı küçük olursa diye aynı işlemleri tekrarlıyoruz.

                while (i <= n2) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        ebob = i;
                    }
                    i++;
                }
            }
            System.out.print("Girilen Sayilarin EBOB'u : " + ebob);
            System.out.println();

            /* Matematiksel olarak ekok'un alabileceği max değer iki değerin çarpılmasıdır. Bu yüzden döngümüzü o değere kadar döndürüyoruz.
             Daha sonra i değerlerini tek tek girilen iki sayıya böldürüyoruz. İki işleminde sıfır olduğu ilk i değeri ekokumuz oluyor ve break atarak işlemin devam etmesini engelliyoruz */

            while (i <= (n1 * n2)) {
                if (i % n1 == 0 && i % n2 == 0) {
                    ekok = i;
                    break;
                }
                i++;
            }
            System.out.print("Girilen Sayilarin EKOK'u : " + ekok);
            System.out.println();
        } else {
            System.out.print("Hatali Bir Deger Girdiniz , Lutfen Tekrar Deneyiniz ! ");
            System.out.println();
        }
    }
}
