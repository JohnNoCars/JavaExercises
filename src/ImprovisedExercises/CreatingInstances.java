package ImprovisedExercises;

public class CreatingInstances {

    public static void main(String[] args) {
        Triangle trianleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle (3, 2.598, 3, 3, 3);

        double triangleAArea = trianleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(trianleA.sideLenThree);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);
    }
}
