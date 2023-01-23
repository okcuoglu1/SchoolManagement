package core.helpers;

import application.console.student.StudentMenuService;
import application.console.teacher.TeacherMenuService;
import entities.concretes.Teachers;

import java.util.Scanner;

public class Start {

    public static void start() {

        Scanner scanner = new Scanner(System.in);
        StudentMenuService studentMenuService = new StudentMenuService();
        TeacherMenuService teacherMenuService = new TeacherMenuService();

        int select;

        do {
            String message = "===== Okul Yönetim Uygulamamiza Hos Geldiniz =====";
            SlowPrint.slowPrint(message,30);
            System.out.println();
            System.out.println("==================================================================");
            System.out.println("ÖGRENCI VE ÖGRETMEN YÖNETIM PANELI");
            System.out.println("==================================================================");
            System.out.println("1-ÖGRENCI ISLEMLERI");
            System.out.println("2-ÖGRETMEN ISLEMLERI");
            System.out.println("0-CIKIS");

            select = scanner.nextInt();

            switch (select) {

                case 1:
                    studentMenuService.getSelectionMenu();
                    break;
                case 2:
                    teacherMenuService.getSelectionMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz...!");
            }

        } while (select != 0);

        System.out.println("Iyi günler, tekrar bekleriz...");
    }



}
