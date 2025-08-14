
// import java.util.ArrayList;
// import java.util.List;

// /*
//  Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.
//  */
// class Student{
//     private String sname;

//     public String getName() {
//         return sname;
//     }

//     public void setName(String sname) {
//         this.sname = sname;
//     }
//     public Student(){
        
//     }
    

// }

// class Teacher{
//     private String tname;

//     public String getName() {
//         return tname;
//     }

//     public void setName(String tname) {
//         this.tname = tname;
//     }
    
// }

// class SchoolClass{
//     private List<Student> student;
//     private Teacher teacher;
//     private String className;
    
//     public SchoolClass(List<Student> student, Teacher teacher, String className) {
//         this.student = student;
//         this.teacher = teacher;
//         this.className = className;
//     }

//     public void addStudent(Student s){
//         student.add(s);
//     }

//     public void removeStudent(Student s){
//         student.remove(s);
//     }

//     @Override
//     public String toString() {
//         return "SchoolClass [student=" + student.size() + ", teacher=" + teacher.getName() + ", className=" + className + "]";
//     }

// }

// public class School {
    
//     private List<Student> students = new ArrayList<>();
//     private List<Teacher> teachers = new ArrayList<>();
//     private List<SchoolClass> classes = new ArrayList<>();
    
//     public void addStudent(Student s) { students.add(s); }
//     public void removeStudent(Student s) { students.remove(s); }

//     public void addTeacher(Teacher t) { teachers.add(t); }
//     public void removeTeacher(Teacher t) { teachers.remove(t); }
    
//     public void addClass(SchoolClass c) { classes.add(c); }
//     public void removeClass(SchoolClass c) { classes.remove(c); }
    
//     public void showSchoolInfo() {
//         System.out.println("School information:");
//         System.out.println("Number of students: " + students.size());
//         System.out.println("Number of teachers: " + teachers.size());
//         System.out.println("Number of classes: " + classes.size());
        
//     }

//     public void showClassesInfo() {
//         for (SchoolClass c : classes) {
//             System.out.println(c);
//         }
//     }
        
//         public static void main(String[] args) {

//         School school = new School();

//         // ✅ Create Students
//         Student s1 = new Student("Alice");
//         Student s2 = new Student("Bob");
//         Student s3 = new Student("Charlie");
//         Student s4 = new Student("Diana");

//         school.addStudent(s1);
//         school.addStudent(s2);
//         school.addStudent(s3);
//         school.addStudent(s4);

//         // ✅ Create Teachers
//         Teacher t1 = new Teacher("Jens Amalia");
//         Teacher t2 = new Teacher("Elise Giiwedin");
//         Teacher t3 = new Teacher("Angelika Lotta");

//         school.addTeacher(t1);
//         school.addTeacher(t2);
//         school.addTeacher(t3);

//         // ✅ Create Classes
//         SchoolClass math = new SchoolClass("Mathematics", t1);
//         math.addStudent(s1);
//         math.addStudent(s2);
//         math.addStudent(s3);
//         math.addStudent(s4);

//         SchoolClass english = new SchoolClass("English", t2);
//         english.addStudent(s1);
//         english.addStudent(s2);
//         english.addStudent(s4);

//         SchoolClass science = new SchoolClass("Science", t3);
//         science.addStudent(s1);
//         science.addStudent(s2);
//         science.addStudent(s3);
//         science.addStudent(s4);

//         school.addClass(math);
//         school.addClass(english);
//         school.addClass(science);

//         // ✅ Display Info (Before Removal)
//         school.showSchoolInfo();
//         System.out.println();
//         school.showClassesInfo();

//         // ✅ Remove one student, teacher, and class
//         school.removeStudent(s4);
//         school.removeTeacher(t2);
//         school.removeClass(english);

//         // ✅ Display Info (After Removal)
//         System.out.println("School information after removing one student, teacher and Class:");
//         school.showSchoolInfo();
//         System.out.println();
//         school.showClassesInfo();

        
//     }
// }
