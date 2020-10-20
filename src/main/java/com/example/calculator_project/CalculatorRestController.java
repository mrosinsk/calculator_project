package com.example.calculator_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRestController {

    @GetMapping("/api")
    public String helloApi(){
        return "Hello from api: calculator_project!";
    }

    @GetMapping("/api/add")
    public String add(){
        Calculator calculate = new Calculator();
        String msg = "5 + 5 = " + calculate.add(5,5);
        return msg;
    }

    @GetMapping("/api/subtract")
    public String subtract(){
        Calculator calculate = new Calculator();
        String msg = "15 - 5 = " + calculate.subtract(15,5);
        return msg;
    }

    @GetMapping("/api/multiple")
    public String multiple(){
        Calculator calculate = new Calculator();
        String msg = "5 * 5 = " + calculate.multiple(5,5);
        return msg;
    }

    @GetMapping("/api/divide")
    public String divide(){
        Calculator calculate = new Calculator();
        String msg = "5 : 5 = " + calculate.divide(5,5);
        return msg;
    }

    @GetMapping("/api/all")
    public String all(){
        CalculatorRestController controller = new CalculatorRestController();
        return "Wszystkie działania:  " + controller.add() + ",   " + controller.subtract() + ",   " +
                controller.multiple() + ",   " + controller.divide();
    }
}
