package com.techacademy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @GetMapping("/plus/{num1}/{num2}")
    public String calcPlus(@PathVariable int num1, @PathVariable int num2) {
        int result = num1 + num2;
        return "実行結果：" + result;
    }

    @GetMapping("/minus/{num1}/{num2}")
    public String calcMinus(@PathVariable int num1, @PathVariable int num2) {
        int result = num1 - num2;
        return "実行結果：" + result;
    }

    @GetMapping("/times/{num1}/{num2}")
    public String calcTimes(@PathVariable int num1, @PathVariable int num2) {
        int result = num1 * num2;
        return "実行結果：" + result;
    }

    @GetMapping("/divide/{num1}/{num2}")
    public String calcDivide(@PathVariable int num1, @PathVariable int num2) {
        int result = num1 / num2;
        return "実行結果：" + result;
    }
}