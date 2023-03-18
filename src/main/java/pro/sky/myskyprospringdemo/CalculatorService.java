package pro.sky.myskyprospringdemo;

public interface CalculatorService {
    String welcome();
    String sumTwoDigits(Integer num1, Integer num2);
    String differenceTwoDigits(Integer num1, Integer num2);
    String multiplyTwoDigits(Integer num1, Integer num2);
    String divideTwoDigits(Integer num1, Integer num2);
}
