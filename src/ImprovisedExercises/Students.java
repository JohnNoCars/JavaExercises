package ImprovisedExercises;

public class Students {
    public static void main(String[] args) {
        StudentProfile studentProfile1 = new StudentProfile("John", "Nocars", 2022, 5.0, "Ecology");
        StudentProfile studentProfile2 = new StudentProfile("Neda", "Nocars", 2022, 3.33, "German");

        System.out.println(studentProfile1.graduationYear());
    }
}
