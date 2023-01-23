package application.console.teacher;

import business.abstracts.IdMaker;
import business.abstracts.MenuService;
import core.validations.IsValidAgeValidator;
import core.validations.IsValidIdValidator;
import core.validations.IsValidNameValidator;
import entities.concretes.Students;
import entities.concretes.Teachers;

import java.util.Scanner;

public class TeacherMenuService extends MenuService implements IdMaker {

    Teachers tchr = new Teachers();
    Scanner scanner = new Scanner(System.in);

    //Validations
    IsValidAgeValidator isValidAge = new IsValidAgeValidator();
    IsValidIdValidator isValidId = new IsValidIdValidator();
    IsValidNameValidator isValidName = new IsValidNameValidator();

    public static int counter = 100;

    @Override
    public void add() {
        System.out.println("Lütfen adinizi giriniz: ");
        tchr.setFirstName(isValidName.isValidFirstName());

        System.out.println("Lütfen soyadinizi giriniz: ");
        tchr.setLastName(isValidName.isValidLastName());

        System.out.println("Lütfen kimlik numaranizi giriniz: ");
        tchr.setId(isValidId.isValid());

        System.out.println("Lütfen yasinizi giriniz: ");
        tchr.setAge(isValidAge.isValidAge());

        System.out.println("Lütfen bölümünüzü giriniz: ");
        tchr.setDepartment(scanner.next());

        tchr.setRegistrationNumber(IdMaker(tchr.getId()));

        tchr.fillTeacherList();
        counter++;
        System.out.println("Öğretmen başarıyla eklenmiştir...");
        list();
        scanner.nextLine();//dummy
    }

    @Override
    public void search() {
        System.out.println("Lütfen aradığınız öğretmenin kimlik numarasını giriniz: ");
        String id = scanner.next();
        int flag = 0;

        for (Teachers w:tchr.teachersList){

            if (w.getId().equals(id)){
                System.out.println(w);
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Girilen kimlik numarası ile eşleşen öğretmen bulunamamıştır");
        }else {
            System.out.println("Öğretmen başarıyla bulunmuştur");
        }
        scanner.nextLine();//dummy

    }

    @Override
    public void list() {
        System.out.printf("%-15s  %-15s  %-3s  %-11s  %-15s  %-16s \n","Name","Surname","Age","Department","ID","Registration No");
        System.out.printf("%-15s  %-15s  %-3s  %-11s  %-15s  %-16s \n","----","-------","---","----------","--","--------------");

        for (Teachers w:tchr.teachersList){
            System.out.printf("%-15s  %-15s  %-3s  %-11s  %-15s  %-16s \n",w.getFirstName(),w.getLastName(),w.getAge(),w.getDepartment(),w.getId(),w.getRegistrationNumber());
        }

    }

    @Override
    public void delete() {

        System.out.println("Silmek istediginiz öğretmenin kimlik numarasini giriniz: ");
        String deletedId = scanner.next();
        int flag = 0;

        for (Teachers w:tchr.teachersList){

            if (w.getId().equals(deletedId)){
                tchr.teachersList.remove(w);
                flag++;
                break;
            }
        }

        if (flag==0){
            System.out.println("Girdiğiniz kimlik numarası ile eşleşen öğretmen bulunamadi.");
        }else {
            System.out.println("Öğretmen başarıyla sistemden silinmiştir.");
            list();
        }


    }




    @Override
    public String IdMaker(String number) {

        String suffix = "Tch";

        number = number.substring(number.length()-3);

        return suffix + number + counter;
    }

}
