/* 
* The class BMICalculator holds the method calculateBMI the returns the BMI of a user
* https://www.calculator.net/bmi-calculator.html
*
* Tyler Giczkowski
*/

public class BMICalculator
{
    public double calculateBMI(int mass, int heightFeet, int heightInches) { // Mass in pounds, height in inches
        double result = 0;
        int totalHeight = (heightFeet * 12) + heightInches; // Calculates total height
        result = (mass / Math.pow(totalHeight, 2)) * 703;   // Calculates BMI and puts value in "result"
        result = Math.floor(result * 10) / 10;              // Truncates result to 1 decimal place and puts value in "result"
        return result;                                      // returns result
    }
    public static void main(String[] args){
        BMICalculator bmiCalculator = new BMICalculator();
        System.out.println(bmiCalculator.calculateBMI(175, 5, 10));
    }
}
