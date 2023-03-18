package pro.sky.myskyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController (CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
        public String welcome() {
            return calculatorService.welcome();
    }
    @GetMapping(path = "/plus")
        public String sumTwoDigits(@RequestParam(value = "число1", required = false) Integer num1, @RequestParam(value = "число2", required = false) Integer num2) {
            if (num1 == null || num2 == null) {
                return "Неверные данные! Пожалуйста, укажите правильные аргументы числа 1 и числа 2";
            }
                return calculatorService.sumTwoDigits(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String differenceTwoDigits(@RequestParam(value = "число1", required = false) Integer num1, @RequestParam(value = "число2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Неверные данные! Пожалуйста, укажите правильные аргументы числа 1 и числа 2";
        }
        return calculatorService.differenceTwoDigits(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyTwoDigits(@RequestParam(value = "число1",required = false) Integer num1, @RequestParam(value = "число2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Неверные данные! Пожалуйста, укажите правильные аргументы числа 1 и числа 2";
        }
        return calculatorService.multiplyTwoDigits(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divideTwoDigits(@RequestParam(value = "число1",required = false) Integer num1, @RequestParam(value = "число2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Неверные данные! Пожалуйста, укажите правильные аргументы числа 1 и числа 2";
        }
        if (num2.equals(0)) {
            return "На ноль делить нельзя - исправьте число 2";
        }
        return calculatorService.divideTwoDigits(num1, num2);
    }
}
