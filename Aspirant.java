package Exam2;

public class Aspirant extends Student{
    String NaukWork;

    public Aspirant(String firstname, String lastname, String group, String isElder, double averageMark, String naukWork) {
        super(firstname, lastname, group, isElder, averageMark);
        this.NaukWork = naukWork;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "NaukWork='" + NaukWork + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Group='" + Group + '\'' +
                ", isElder='" + isElder + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public double getScholarship() {
        return averageMark == 5 ? 2000 : 1800;
    }
}
