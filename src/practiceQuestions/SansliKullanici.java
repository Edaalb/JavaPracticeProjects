package practiceQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SansliKullanici {
    // ekrandan n tane saticinin isminin ve aylik satislarinin
    // girildigini dusunelim
    // satislari 10.000 tl nin uzerindeki odul alacak
    // saticinin ismini ekrana yazdiracak bir program yazinin

    public static void main(String[] args) {

        int saticiSayisi;
        int odulLimiti =10000;

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet satici icin bilgi gireceksiniz, belirtiniz");
        //döngümüzü ne kadar çevireceğimizi belirleyen şey satıcı sayımız olacak

        saticiSayisi= scan.nextInt(); //sadece 1 kez girileceği için döngünün içine yazmayız. 4
        // Bunu sadece 1 kez soracağız. Ancak diğer istediğimiz bilgileri tekrar tekrar gireceği
        // ve her seferinde ekrana yazmasını isteyeceğimiz için for döngüsü içerisine yazdık

        //satıcının girdiği ilk değeri satıcı sayıyısa atarız. Böylelikle döngümüzü kaç defa çevireceğimizi bilebiliriz

        //döngüyü başlatmadan önce diğer variable’ları tanımlarız
        //satıcı isimlerini kullanıcı tek tek girdiğinde kullanıcı ekrana satıcı
        // isimleri ve satış tutarı girecek. İkisi farklı data türünde, bu yüzden ikisini
        // aynı variable’a atayamayız. İki farklı farklı array oluştururuz.

        String[] saticiIsimleri = new String[saticiSayisi]; //satıcıSayısı burada satıcıIsimleri array’inin lenght’dir.
        int[] satisTutarlari = new int[saticiSayisi]; //aldığımız bilgileri kaydetmek için bunları tanımlarız

        ArrayList<String> odulAlacakSaticilar = new ArrayList<>(); //ulaşmak istediğimiz sonuç yani odılAlacakSatıcılar’ın
        // ismi / işlem yaptıkça ve bilgilere ulaştıkça buraya kaydederiz.
        // Birden fazla isim olabileceği için tek String olmaz bu yüzden array oluştururuz.
        // For döngüsü çalıştıkça uygun olan isimleri buraya ekler. En sonda yazdırdığımızda bunu görürüz.
        //kullanıcıdan bütün satıcıIsimlerini girmesini for döngüsü içinde isteriz

        //burası sadece kullanıcıya mesaj verdiğimiz döngü.
        // Kullanıcı yukarıda kaç satıcı için bilgi gireceğini seçmişti.
        // Döngü bittiğinde kullanıcı tüm satıcılar için bilgileri girmiş olacak
        for (int i = 1; i <= saticiSayisi  ; i++) { //i 1’den satıcı sayısına küçük veya eşit oluncaya kadar
        //array’in lenght’i satıcıSayısı, eğer 0’dan başlatırsak sadece küçük ya da -1 yapmamız gerekir.
        // kullanıcıya ekranda 0. Satıcıdan bilgileri gir dememek için 1’den başlattık.

         System.out.println("Lutfen " + i + ". saticinin ismini giriniz");
         saticiIsimleri[i-1] = scan.next(); //kullanıcının girdiği her bir değeri yukarıda tanımladığımız liste’ye atıyoruz.
                                            //for döngüsü bitinceye kadar kullanıcıdan veri alırız.

         System.out.println("Lutfen " + i + ". saticinin aylik satis tutarini giriniz");
         satisTutarlari[i-1] = scan.nextInt(); //aynı işlemi satısTutarları için tekrar ederiz.
            // Girilen değerleri eleman olarak ekleriz.
            // loop’ta i 1 olduğunda ilk alacağımız değer 0. İndex olacak.
            // array olduğu için indexler 1’den değil 0’dan başlayacak i-1 . i 1 olduğunda alıp 0. İndex’e atarız.
            // Alternatif olarak for 0’dan başlar yazdırırken i+ yaparız. Kullanıcı ekranda 0 görmez 1 görür
        }

        //soruda istenmiyor ancak elde ettiğimiz bilgileri kontrol amaçlı yazdıralım
        System.out.println(Arrays.toString(saticiIsimleri));
        System.out.println(Arrays.toString(satisTutarlari));

        //hesaplama kısmı bu aşamada başlıyor. Satıcıların girdiği verilerden kimlerin ödül alabildiği hesaplatılacak

        //artık array üzerinden kontrol yapacağımız için 0. İndexten kontrole başlatabiliriz.

        //karşılaştırdığımız yani 10000’den büyük olup olmadığına baktığımız şey satışTutarları.
        // Array ile herbiri 10000’e eşit mi büyük mü diye kontrol ederiz.
        // Ancak aradığımız değeri bulduğumuzda yazdırdığımız şey bu değildir.
        // If bloğu içinde karşılaştırıp doğruluğunu kontrol ettiğimiz veri satısTutarları array’inden geliyor
        // ancak ekranda yazdırdığımız ulaşmak istediğimiz şey odül alacak satıcılar.
        // Bu yüzden her i’nci indexte eğer şartımız gerçekleşiyorsa o indexteki satış tutarı 10bin
        // üzerindeyse aynı indexteki isim arrayine gidip o ismi alıp sadece ödül alacak olanları eklediğimiz yere ekliyoruz.

        for (int i = 0; i < satisTutarlari.length; i++) { //satısTutarları array’inin lenght’ine kadar gidecek.
                                              // Lenght satıcıSayısı, ikisi de aynı şeydir. İkisi de yazılabilir.

        //hesaplamayı if bloğu içinde yaparız.

        //kontrol edeceğimiz şey satısTutarları, bu array halinde olduğu için herbir
        // index’i tek tek kontrol etmemiz gerekecek

        //satısTutarları array’inin i’inci indexi, her bir i çevrildiğinde, yani i 0 iken 0. İndex
        // büyük > yada eşit = olursa odulLimiti

        // ArrayList<String> odulAlacakSaticilar = new ArrayList<>(); array’ini
        // tek tek kontrol edip uygun şartları sağlayığ ödül almayı hak eden satıcıları başka bir listeye atarız

            if(satisTutarlari[i] >= odulLimiti){ //satısTutarları’na girdiğimiz değerlerden 10000’den büyük olan
                                                // bir tanesini bulduğunda yapmasını istediğimiz işlem
                                                //odulAlacakSatıcılar listesine satıcıIsımleri’nin i.ninci indexini eklesin
                odulAlacakSaticilar.add(saticiIsimleri[i]);

            }

        }
        //for döngüsü dışına çıkıp yazdırırız.
        System.out.println("odul alacak saticilar : " + odulAlacakSaticilar);
    }
}


