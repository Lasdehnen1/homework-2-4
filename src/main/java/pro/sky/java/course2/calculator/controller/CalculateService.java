package pro.sky.java.course2.calculator.controller;

public interface CalculateService {
    String helloCalculator();
    String calculateSum(Integer num1, Integer num2);
    String calculateDifference(Integer num1, Integer num2);
    String calculateProduct(Integer num1, Integer num2);
    String calculateQuotient(Integer num1, Integer num2);

}
