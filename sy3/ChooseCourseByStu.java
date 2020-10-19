package sy3;

public class ChooseCourseByStu {
    public static void main(String[] args) {
        Student stu0 = new Student(1001,"wyf");
        Student stu1 = new Student(1002,"wwyf");
        Student stu2 = new Student(1003,"wwwyf");
        Student stu3 = new Student(1004,"wwwwyf");
        Course cour0 = new Course(001,"course1");
        Course cour1 = new Course(002,"course2");
        Course cour2 = new Course(003,"course3");
        stu0.addCourse(cour0);
        stu0.addCourse(cour2);
        stu0.addCourse(cour1);
        stu1.addCourse(cour2);
        stu1.addCourse(cour0);
        stu2.addCourse(cour1);
        stu3.addCourse(cour0);
        stu3.addCourse(cour1);
        stu1.removeCourse(cour2);
        stu0.displayCourse();
        cour0.removeStudent(stu1);
        cour1.displayStudent();
    }
}

