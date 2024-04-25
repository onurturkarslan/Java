package Week1;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        // Değişkenlerimizi oluşturalım.
        String userName, password, newPassword;

        // Scanner sınıfını ekleyelim.
        Scanner girdi = new Scanner(System.in);

        // Girdilerimizi alalım.
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = girdi.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = girdi.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı.");
        }else{
            System.out.println("Hatalı Giriş! Şifrenizi sıfırlamak ister misiniz? (Evet/Hayir)");
            String secim = girdi.nextLine();
            if (secim.equals("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = girdi.nextLine();
                if (!newPassword.equals(password)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Yeni şifre, eski şifre ile aynı olamaz. Lütfen başka bir şifre giriniz.");
                }
            }else{
                System.out.println("İyi günler dileriz.");
            }
        }
    }
}
