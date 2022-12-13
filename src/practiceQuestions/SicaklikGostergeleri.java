package practiceQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SicaklikGostergeleri {

    // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
    // 100 girildiğinde veri girişi sonlandırılsın.
    // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

    public static void main(String[] args) {
        //kullanıcıya direk sıcaklık değerini gir demeyiz.
        // Kullanıcı başlangıçta bilmediğimiz sayıda sıcaklık girişi yapacak.
        // Bunu sonlandırdığını 100 girişi yaptığında anlayacağız. Bunu oluşturacağımız döngü içinde yapacağız.

        Scanner scan = new Scanner(System.in);
        ArrayList<Double> gununSicaklari=new ArrayList<>(); //kullanıcının gireceği sıcaklık veriler için.
        //ArrayList’in uzunluğunu baştan belirlemek zorunda olmadığından kullanıcıya
        // kaç tane gireceğini sorup uzunluk değeri yazmamıza gerek yok.

        //ihtiyacımız olacağını bildiğimiz değişkenleri tanımlarız.
        int sonlandirmaDegeri=100;
        double girilenSicaklik =0;
        int sayac = 0; //soruda kaç tane değer girildiğini sormuyor ancak ihtiyacımız olabilir diye oluşturabiliriz

        //do-while döngüsü kullanarak soruyu çözebiliriz. For loop bunun için uygun değildir
        // çünkü kullanıcının kaç tane gireceğini bilmiyoruz. For loop kullanabilmek için
        // ya kullanıcıya baştan kaç tane sıcaklık değeri gireceğini sormamız gerekir ya da while kullanırız.

        //bu formül en azından bir kere çalışsın ve ekrana bir şeyler yazsın diye do-while ile yapıyoruz

        do {
            System.out.println("Listeye eklemek icin bir sicaklik degeri girin"
                    +"\nsicaklik girisini sonlandirmak icin 100 girin");
            //program çalışmaya başladığında kullanıcı ilk olarak bu mesajı görecek

            girilenSicaklik= scan.nextDouble();

            if(girilenSicaklik !=100) { //girilen sıcaklık 100 olmadığı sürece döngü devam eder
                gununSicaklari.add(girilenSicaklik); //girilen her yeni değeri ekleriz
                sayac++; //kaç veri girdiğimizi takip etmek için sayacı istersek kullanabiliriz

                // buraya kadar olan süreçte yalnızca kullanıcıdan listeyi aldık

            } //girilen sıcaklık 100’e eşit olmadığında biter
        } while(girilenSicaklik !=100); {
            System.out.println("veri girisi sonlandirildi");
        }
        Collections.sort(gununSicaklari); //elde ettiğimiz verileri sıralatırız. En büyük ve küçüğü görmenin en kısa yolu budur

        //elde ettiğimiz verileri hesaplatma
        System.out.println("Gunun en dusuk sicakligi :" + gununSicaklari.get(0)); //0. İndex en düşük sıcaklık
        System.out.println("Gunun en yuksek sicakligi :" + gununSicaklari.get(sayac-1)); //en sondaki en büyük
    }
}
