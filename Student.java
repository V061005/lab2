public class Student {

    public static void main(String[] args) {
        // Student details
        String studentName = "Vaishnavi";
        int birthYear = 2005;
        int currentYear = 2025;

        // Calculate age
        int age = currentYear - birthYear;

        // Display output
        System.out.println("===== Student Details =====");
        System.out.println("Name: " + studentName);
        System.out.println("Age : " + age);
    }
}
