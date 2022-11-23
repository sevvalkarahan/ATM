import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        int right=3;
        int select;
        int balance=3000;
        Scanner inp=new Scanner(System.in);
        while (right>0){
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName=inp.nextLine();
            System.out.println("Parolanızı giriniz: ");
            password=inp.nextLine();
            if (userName.equals("sevvalkarahan") && password.equals("siyah123")) {
                System.out.println("Hoş Geldiniz...");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1-Para Çekme \n" +
                            "2-Para Yatırma \n" +
                            "3-Bakiye Sorgulama \n" +
                            "4-Çıkış Yap");
                    select=inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            int amount=inp.nextInt();
                            if (amount>balance)
                                System.err.println("Yetersiz Bakiye!");
                            else
                                balance-=amount;
                            System.out.println("Para Çekme işlemi tamamlandı.");
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                            int price=inp.nextInt();
                            balance+=price;
                            System.out.println("Paranız Yatırılıyor.");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;

                    }
                }while (select!=4);
                System.out.println("Çıkış Yapılıyor. Teşekkürler...");

                break;
            }
            else{
                right--;
                System.err.println("Kullanıcı adı veya şifre yanlış.");
                if (right==0)
                    System.err.println("HESABINIZ BLOKE OLMUŞTUR. LÜTFEN BANKANIZLA İLETİŞİME GEÇİNİZ!");
                else
                    System.err.println("Kalan hakkınız: "+right);
            }


        }

    }
}
