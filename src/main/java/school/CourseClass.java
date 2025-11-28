package school;

public class CourseClass {

 private String name;
 private  int code ;
 private String prefix;
 private Teacher teacher;
private double examWeight;
private double oralWeight;
private int examNote;
private int oralNote;

    public CourseClass(String name, int code, String prefix, Teacher teacher, double oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.examWeight =1 - oralWeight;
        this.oralWeight = oralWeight;
    }



    public void setNotes(int examNote, int oralNote){
        this.examNote = examNote;
        this.oralNote=oralNote;
    }

    public void setOralWeight(double oralWeight) {
        this.oralWeight = oralWeight;
        this.examWeight = 1 - oralWeight; // otomatik güncellenir
    }

  public double average (){
        return (oralNote*oralWeight )+ (examNote*examWeight);
  }


    public  void  addTeacher (Teacher teacher){
this.teacher = teacher;

 }



    public void printTeacher() {
        if (this.teacher != null) {
            System.out.println("Dersi veren öğretmen: " + teacher.getName()+ " - " + teacher.getBranch());
        } else {
            System.out.println("Bu derse henüz öğretmen atanmadı.");
        }
    }

    public String getName() {
        return name;
    }




}
