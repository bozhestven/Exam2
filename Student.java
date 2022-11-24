package Exam2;

public class Student {
    String Firstname;
    String Lastname;
    String Group;
    String isElder;
    double averageMark;


    public Student(String firstname, String lastname, String group, String isElder, double averageMark) {
        Firstname = firstname;
        Lastname = lastname;
        Group = group;
        this.isElder = isElder;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Group='" + Group + '\'' +
                ", isElder='" + isElder + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }

    public double getScholarship() {
        return averageMark == 5 ? 1000 : 800;
    }


}
