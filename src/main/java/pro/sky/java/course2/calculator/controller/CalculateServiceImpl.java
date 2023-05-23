package pro.sky.java.course2.calculator.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {


    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    public void notNullCheck(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException("Нет одного из параметров");
        }
    }
    public void nullDivide(int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
    }
    public String calculateSum(Integer num1, Integer num2) {
        notNullCheck(num1, num2);
        int sum = num1 + num2;
        return String.format("%s + %s = %s", num1, num2, sum);

    }

    public String calculateDifference(Integer num1, Integer num2) {
        notNullCheck(num1, num2);
        int diff = num1 - num2;
        return String.format("%s - %s = %s", num1, num2, diff);
    }


    public String calculateProduct(Integer num1, Integer num2) {
        notNullCheck(num1, num2);
        int product = num1 * num2;
        return String.format("%s * %s = %s", num1, num2, product);
    }


    public String calculateQuotient(Integer num1, Integer num2) {
        notNullCheck(num1, num2);
        nullDivide(num2);
        int quotient = num1 / num2;
        return String.format("%s / %s = %s", num1, num2, quotient);
    }

}
