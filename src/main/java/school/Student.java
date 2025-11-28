package school;

public class Student {
    String name;
    int stuNo;
    String classes;
    CourseClass course1;
    CourseClass course2;
    CourseClass course3;
    double average;
    boolean isPass;

    public Student(String name, int stuNo, String classes, CourseClass course1, CourseClass course2, CourseClass course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }



    public void addBulkExamNote(int exam1,int oral1,int exam2 , int oral2,int exam3 , int oral3){

   course1.setNotes(exam1,oral1);
        course2.setNotes(exam2,oral2);
        course3.setNotes(exam3,oral3);

    }



    public void  calcAverage(){
double avg1 = course1.average();
double avg2 = course2.average();
double avg3 = course3.average();

this.average = (avg1+avg2+avg3)/3.0;
    }

    public boolean issPass(){
    this.isPass=    this.average>=55;
        return this.isPass;

    }

    public void printNote(){
        System.out.println(course1.getName() + " Ortalaması " + course1.average());
        System.out.println(course2.getName() + " Ortalaması " + course2.average());
        System.out.println(course3.getName() + " Ortalaması " + course3.average());

        System.out.println("Genel ortalama : " + this.average);
        System.out.println("Geçme durumu : " + (this.isPass ? "Geçti": "Kaldı") );
    }



























}
