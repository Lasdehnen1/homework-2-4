package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculateService;

@RequestMapping(path = "/calculator")
@RestController
public class CalculatorController {

    private final CalculateService calculateService;
    public CalculatorController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }
    @GetMapping
    public String helloCalculator() {
        return calculateService.helloCalculator();
    }
    @GetMapping(path = "/plus")
    public String calculateSum(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {

        return calculateService.calculateSum(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String calculateDifference(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculateService.calculateDifference(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculateProduct(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculateService.calculateProduct(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculateQuotient(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculateService.calculateQuotient(num1, num2);
    }


}
