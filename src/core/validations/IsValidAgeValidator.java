package core.validations;

import java.util.Scanner;

public class IsValidAgeValidator {
    Scanner scanner = new Scanner(System.in);

    public int isValidAge(){

       int age = 0;


       do {
           age = scanner.nextInt();
           if(age<0 || age>100){
               System.out.println("Lütfen geçerli bir yaş giriniz...");
               System.out.println("Tekrar giriniz: ");
           }else{
               break;
           }

       }while(true);

        return age;



    }


}
