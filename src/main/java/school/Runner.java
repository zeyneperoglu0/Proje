package school;

public class Runner {
    public static void main(String[] args) {


        Teacher t1 = new Teacher("Ahmet Gün", "Mathematics");
        Teacher t2 = new Teacher("Seda Ala", "Physics");
        Teacher t3 = new Teacher("Tuğçe Soran", "Chemistry");
        Teacher t4 = new Teacher("Eda Tunca", "Biology");
        Teacher t5 = new Teacher("Mehmet Erdem", "English");

        CourseClass math = new CourseClass("Mathematics", 101, "MATH", t1, 0.2);
        CourseClass physics = new CourseClass("Physics", 102, "PHY", t2, 0.2);
        CourseClass chemistry = new CourseClass("Chemistry", 103, "CHM", t3, 0.2);
        CourseClass biology = new CourseClass("Biology", 104, "BIO", t4, 0.2);
        CourseClass english = new CourseClass("English", 105, "ENG", t5, 0.2);

        math.addTeacher(t1);
        math.printTeacher();
        Student s1 = new Student("Ayşe", 1001, "12-A", math, physics, chemistry);
        Student s2 = new Student("Eda", 1002, "12-B", math, english, chemistry);
        Student s3 = new Student("Ali", 1003, "12-C", math, physics, biology);
        Student s4 = new Student("Veli", 1004, "12-D", biology, physics, chemistry);
        Student s5 = new Student("Fatma", 1005, "12-E", math, english, chemistry);


        s1.addBulkExamNote(50, 60, 80, 90, 100, 75);
        s1.calcAverage();
        s1.issPass();
        s1.printNote();
        s2.addBulkExamNote(90, 76, 84, 30, 56, 87);
        s2.calcAverage();
        s2.issPass();
        s2.printNote();
        s3.addBulkExamNote(35, 90, 78, 43, 67, 90);
        s3.calcAverage();
        s3.issPass();
        s3.printNote();
        s4.addBulkExamNote(89, 92, 67, 45, 78, 29);
        s4.calcAverage();
        s4.issPass();
        s4.printNote();
        s5.addBulkExamNote(78, 59, 60, 50, 40, 10);
        s5.calcAverage();
        s5.issPass();
        s5.printNote();


    }
}
