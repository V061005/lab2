class Course {
    String course;
    int sem;
    float marks;

    Course(String course, int sem, float marks) {
        this.course = course;
        this.sem = sem;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Course Name: " + course + ", Sem: " + sem + ", Marks: " + marks);
    }
}

public class Demo {
    public static void main(String[] args) {
        Course s1 = new Course("Java", 4, 30);
        Course s2 = new Course("Devops", 4, 30);
        Course s3 = new Course("BigData", 4, 30);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}