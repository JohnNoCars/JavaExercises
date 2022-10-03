package ImprovisedExercises;

public class StudentProfile {

    String firstName;
    String lastName;
    int expectedGraduationYear;
    double gpa;
    String declaredMajor;

    public StudentProfile (String firstName, String lastName, int expectedGraduationYear, double gpa, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public int graduationYear() {
        return expectedGraduationYear+1;
    }
}
