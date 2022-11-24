package Exam2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Соонбай", "Жээнбеков","Group1","Elder1",5.0);
        Aspirant aspirant = new Aspirant("Садыр", "Жапаров", "Group777", "Elder2", 4.7,"Bishkek");
        Student aspirant1 = new Aspirant("Алмаз","Бандит","Group666","Elder3",3.3,"Osh");
        Student[] students = {student,aspirant,aspirant1};
        for(Student s : students){
            System.out.println(s.getScholarship());
        }
        System.out.println(student.toString());





    }
}
