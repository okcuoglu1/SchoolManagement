package application.console.student;

import business.abstracts.MenuService;
import entities.abstracts.User;
import entities.concretes.Students;

import java.util.List;
import java.util.Scanner;

public class StudentMenuService extends MenuService {

    Students std = new Students();
    Scanner scan = new Scanner(System.in);



    //Id = kimlik no
    //OgrenciNo = suffix + kimlikNo(son 3 hane ) + counter

    @Override
    public void add() {
        System.out.print("Lutfen adınızı giriniz: ");
        std.setFirstName(scan.nextLine());

        System.out.print("Lutfen soyadınızı giriniz: ");
        std.setLastName(scan.nextLine());

        System.out.print("Lutfen kimlik numaranızı giriniz: ");
        std.setId(scan.nextInt());

        System.out.print("Lutfen yaşınızı giriniz: ");
        std.setAge(scan.nextInt());

        System.out.print("Lutfen sınıfınızı giriniz: ");
        std.setGrade(scan.next());

        System.out.print("Öğrenci Numaranız: ");

    }

    @Override
    public void search() {

    }

    @Override
    public void list() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void getSelectionMenu() {
        super.getSelectionMenu();
    }



    private String studentIdMaker(String suffix,int id){

        suffix = "Std-";
        int counter = 100;

       //String idx = std.getId()




        return "";


    }



}
