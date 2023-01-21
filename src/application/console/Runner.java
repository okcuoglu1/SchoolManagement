package application.console;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        start();




    }

    public static void start(){
        Scanner scan = new Scanner(System.in);
        int select;

        do {
            String message = "=======Okul Yönetim Uygulamıza Hos Geldiniz========";
            slowPrint(message,30);
            System.out.println("=====================================");
            System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
            System.out.println("=====================================");
            System.out.println("1-ÖĞRENCİ İŞLEMLERİ");
            System.out.println("2-ÖĞRETMEN İŞLEMLERİ");
            System.out.println("0-ÇIKIŞ");
            select = scan.nextInt();

             switch (select){

                 case 1:
                     //Öğrenci işlemleri
                    break;
                 case 2:
                     //Öğretmen işlemleri
                     break;
                 case 0:
                     break;
                 default:
                     System.out.println("Hatalı Giriş Yaptiniz....!");

             }

        }while (select !=0);

        System.out.println("İyi Günler Tekrar Bekleriz");



    }

    public static void slowPrint(String message, int delay){

        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    }

}
