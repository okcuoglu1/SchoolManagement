package core.validations;

import java.util.Scanner;

public class IsValidIdValidator {

    public  String isValid(){
        Scanner scan = new Scanner(System.in);
        String id = "";
        do {
            id = scan.next();
            String s = id.replaceAll("\\d", "");



            if (!s.isEmpty()){
                System.out.println("Kimlik numarası sayı dışında karakter içeremez!");
                System.out.println("Tekrar deneyiniz: ");
            }else if (id.length()!=11){
                System.out.println("Kimlik numarası 11 rakamdan oluşmalıdır!");
                System.out.println("Tekrar deneyiniz: ");
            }else {
                break;
            }

        }while(true);

        return id;

    }








}
