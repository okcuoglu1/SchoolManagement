package business.abstracts;

import entities.abstracts.User;

import java.util.List;
import java.util.Scanner;

public abstract class MenuService {

    protected String personType = "";

    Scanner scan = new Scanner(System.in);

    public abstract void add(); //Userdan parametre kullanıcak kişi ekliyicek

    public abstract void search();

    public abstract void list();

    public abstract void delete();



    public  void getSelectionMenu(){

        int select = -1;

        do {
            String message = "=======Okul Yönetim Uygulamıza Hos Geldiniz========";

            System.out.println("===========İŞLEMLER==============");
            System.out.println("1-EKLEME");
            System.out.println("2-ARAMA");
            System.out.println("3-LISTELEME");
            System.out.println("4-SİLME");
            System.out.println("5-ANA MENU");
            System.out.println("0-ÇIKIŞ");
            select = scan.nextInt();

            switch (select){

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
                   select = 0;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı Giriş Yaptiniz....!");

            }

        }while (select !=0);

        System.out.println("İyi Günler Tekrar Bekleriz");






    }



















}
