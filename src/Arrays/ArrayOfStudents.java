package Arrays;

class Student{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfStudents {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "manoj";
        s1.marks = 84;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "siva";
        s2.marks = 74;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "chinna";
        s3.marks = 94;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }  //Type 1

        for (Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        } //Type 2 Enhanced For Loop
    }
}
