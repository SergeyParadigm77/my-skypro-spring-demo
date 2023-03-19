package pro.sky.myskyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public Integer sumTwoDigits(Integer num1, Integer num2) {
        return num1 + num2;
    }
    public Integer differenceTwoDigits(Integer num1, Integer num2) {
        return num1 - num2;
    }
    public Integer multiplyTwoDigits(Integer num1, Integer num2) {
        return num1 * num2;
    }
    public Integer divideTwoDigits(Integer num1, Integer num2) {
       return num1 / num2;
    }
}
