package jam.study.day02;

import jam.study.day01.Person;

public class Student extends Person {
    private String school;
    private int stdNumber;

    public Student(String name, int age, String school, int stdNumber) {
        super(name, age);
        this.school = school;
        this.stdNumber = stdNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStdNumber() {
        return stdNumber;
    }

    public void setStdNumber(int stdNumber) {
        this.stdNumber = stdNumber;
    }
}
