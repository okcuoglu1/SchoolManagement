package entities.concretes;

import entities.abstracts.User;

import java.util.ArrayList;
import java.util.List;

public class Students extends User {

   public List<Students> studentList = new ArrayList<>();



    private String number;
    private String grade;

    public String getNumber() {
        return number;
    }

    public String getGrade() {
        return grade;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public Students(String firstname, String lastname, String number, String grade, int id, int age ) {
        super.setFirstName(firstname);
        super.setLastName(lastname);
        this.number = number;
        this.grade = grade;
        super.setId(id);
        super.setAge(age);


    }


    public Students() {
    }

    @Override
    public String toString() {
        return
                "number='" + number + '\'' +
                        ", grade='" + grade + '\''
                ;
    }


    public void fillStudentList(){

        Students s = new Students(super.getFirstName(),super.getLastName(),this.number,this.grade,super.getId(),super.getAge());
        studentList.add(s);


    }



}
