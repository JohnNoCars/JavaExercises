package ImprovisedExercises;

public class TaxTipMeal {

    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }
    public static double salaryCalculator(double hoursPerWeek, double amountPerHour, int vacationDays) {
        if (hoursPerWeek<0){
            return -1;
        }
        if (amountPerHour<0){
            return -1;
        }

        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;
        return (weeklyPaycheck*52) - unpaidTime;

    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15, .2, .85);
        System.out.println(salaryCalculator(40, 200, 25));
        System.out.println(Math.pow(5,2));
    }
}
