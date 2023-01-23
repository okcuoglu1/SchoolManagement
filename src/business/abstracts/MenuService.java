package business.abstracts;

import core.helpers.SlowPrint;
import entities.abstracts.User;

import java.util.List;
import java.util.Scanner;

public abstract class MenuService {

    protected String personType = "";



    public abstract void add();

    public abstract void search();

    public abstract void list();

    public abstract void delete ();

    public void getSelectionMenu(){
        Scanner scan = new Scanner(System.in);

        int select=-1;


        do {
            System.out.println("===== OKul Yönetim Uygulamamiza Hos Geldiniz =====");

            System.out.println("=================  ISLEMLER  ==========================");
            System.out.println("1-EKLEME");
            System.out.println("2-ARAMA");
            System.out.println("3-LISTELEME");
            System.out.println("4-SILME");
            System.out.println("5-ANA MENU");
            System.out.println("0-CIKIS");

            System.out.println("\nSeçiminiz: ");
            select = scan.nextInt();

            switch (select) {

                case 1:
                    this.add();
                    break;
                case 2:
                    this.search();
                    break;
                case 3:
                    this.list();
                    break;
                case 4:
                    this.delete();
                    break;
                case 5:
                    select=0;
                    break;
                case 0:
                    String message = "===== Okul Yönetim Uygulamamizdan Ayrılıyorsunuz =====";
                    SlowPrint.slowPrint(message,30);
                    System.out.println();
                    System.out.println("Iyi günler, tekrar bekleriz...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz...!");
            }


        } while (select != 0);


    }


}



















