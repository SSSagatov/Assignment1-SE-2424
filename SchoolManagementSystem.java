//School class
class School{
    private String schoolName;
    private String schoolAddress;
    private int numberOfStudents;
    private int schoolYear;

    public School(String schoolName, String schoolAddress, int numberOfStudents, int schoolYear){
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.numberOfStudents = numberOfStudents;
        this.schoolYear = schoolYear;
    }
//getters
    public String getSchoolName(){
        return schoolName;
    }
    public String getSchoolAddress(){
        return schoolAddress;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public int getSchoolYear(){
        return schoolYear;
    }

//setters
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public void setSchoolAddress(String schoolAddress){
        this.schoolAddress = schoolAddress;
    }
    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }
    public void setSchoolYear(int schoolYear){
        this.schoolYear = schoolYear;
    }

//school information display
    public void display_school_info(){
        System.out.println("School Name: " + schoolName);
        System.out.println("School Address: " + schoolAddress);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("School Year: " + schoolYear);
    }
}

//Teacher class
class Teacher{
    private String teacherName;
    private int teachersBirth;
    public int teacherWorkYear;

    public Teacher(String teacherName, int teachersBirth, int teacherWorkYear){
        this.teacherName = teacherName;
        this.teachersBirth = teachersBirth;
        this.teacherWorkYear = teacherWorkYear;
    }

//getters
    public String getTeacherName(){
        return teacherName;
    }

    public int getTeacherBirth(){
        return teachersBirth;
    }
    public int getTeacherWorkYear(){
        return teacherWorkYear;
    }

//setters
    public void setTeacherName(String teacherName){
        this.teacherName = teacherName;
    }
    public void setTeachersBirth(int teachersBirth){
        this.teachersBirth = teachersBirth;
    }
    public void setTeacherWorkYear(int teacherWorkYear){
        this.teacherWorkYear = teacherWorkYear;
    }

//Teacher's information
    public void display_teacher_info(){
        System.out.println("Teacher's name: " + teacherName + ".");
        System.out.println("Teacher date of birth: " + teachersBirth + " year.");
        System.out.println("Experience of " + teacherName + " is " + teacherWorkYear + " years.");
    }
}

//Student class
class Student{
    private String studentName;
    private int studentBirth;
    public int averageScore;

    public Student(String studentName, int studentBirth, int averageScore){
        this.studentName = studentName;
        this.studentBirth = studentBirth;
        this.averageScore = averageScore;
    }

//getters
    public String getStudentName(){
        return studentName;
    }
    public int getStudentBirth(){
        return studentBirth;
    }
    public int getAverageScore(){
        return averageScore;
    }

//setters
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentBirth(int studentBirth){
        this.studentBirth = studentBirth;
    }
    public void setAverageScore(int averageScore){
        this.averageScore = averageScore;
    }

//Student's information
    void display_student_info(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Birth: " + studentBirth);
        System.out.println("Student Average: " + averageScore);
    }
}

//Main function that will be output all classes information
public class SchoolManagementSystem {
    public static void main(String[] args) {
        School school = new School("Гимназия №3", "Бухар Жырау 19", 530,2009);
        Teacher teacher1 = new Teacher("Ирина Николаевна", 1955, 30);
        Teacher teacher2 = new Teacher("Марал Инырбаевна", 1968, 20);
        Teacher teacher3 = new Teacher("Татьяна Михайловна", 1960, 25);
        Student student1 = new Student("Санжар Сагатов", 2006,4);
        Student student2 = new Student("Даниал Нуртаза", 2006,5);
        Student student3 = new Student("Танбай Елнур", 2007, 4);

        school.display_school_info();
        System.out.println();
        teacher1.display_teacher_info();
        teacher2.display_teacher_info();
        teacher3.display_teacher_info();
        System.out.println();
        student1.display_student_info();
        student2.display_student_info();
        student3.display_student_info();
        System.out.println();

        if(student1.averageScore > student2.averageScore && student1.averageScore > student3.averageScore){
            System.out.println("Санжар Сагатов is the most clever." );
        } else if(student2.averageScore > student1.averageScore && student2.averageScore > student3.averageScore){
            System.out.println("Даниал Нуртаза is most clever.");
        } else if(student3.averageScore > student1.averageScore && student3.averageScore > student2.averageScore){
            System.out.println("Елнур Танбай is most clever.");
        }

        if(teacher1.teacherWorkYear > teacher2.teacherWorkYear && teacher1.teacherWorkYear > teacher3.teacherWorkYear){
            System.out.println("Ирина Николаевна is more qualified teacher.");
        } else if(teacher2.teacherWorkYear > teacher1.teacherWorkYear && teacher2.teacherWorkYear > teacher3.teacherWorkYear){
            System.out.println("Марал Инырбаевна is more qualified teacher.");
        } else if(teacher3.teacherWorkYear > teacher2.teacherWorkYear && teacher3.teacherWorkYear > teacher1.teacherWorkYear) {
            System.out.println("Татьяна Михайловна is more qualified teacher.");
        }
    }
}