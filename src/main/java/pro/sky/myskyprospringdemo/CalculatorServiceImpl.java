package pro.sky.myskyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcome() {
        return ("<b>Добро пожаловать в калькулятор!<b/>");
        }
    public String sumTwoDigits(Integer num1, Integer num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }
    public String differenceTwoDigits(Integer num1, Integer num2) {
        int difference = num1 - num2;
        return num1 + " - " + num2 + " = " + difference;
    }
    public String multiplyTwoDigits(Integer num1, Integer num2) {
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
    }
    public String divideTwoDigits(Integer num1, Integer num2) {
        int divide = num1 / num2;
        return num1 + " : " + num2 + " = " + divide;
    }
}
