package application.console.student;

import business.abstracts.MenuService;
import entities.abstracts.User;
import entities.concretes.Students;

import java.util.List;
import java.util.Scanner;

public class StudentMenuService extends MenuService {

    Students std = new Students();
    Scanner scan = new Scanner(System.in);

    int counter = 100;

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

        std.fillStudentList();
        System.out.println("Öğrenci başarıyla eklenmiştir.");

        counter++;

    }

    @Override
    public void search() {
        System.out.print("Lutfen Aradığınız Öğrencinin Kimlik Numarasını giriniz: ");
        int id = scan.nextInt();

        for(Students w : std.studentList){

            if(w.getId()==id){
                System.out.println(w);
            }


        }


    }

    @Override
    public void list() {
        System.out.println("Öğrenciler Listeleniyor...");
        System.out.println(std.studentList);

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


       String last3 = String.valueOf(std.getId());
       last3.substring(last3.length()-3);


        return suffix + last3  +  counter ;


    }



}
