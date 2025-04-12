package Faramish.com.github.controllers;

import Faramish.com.github.exception.UnsupportedMathOperationException;
import Faramish.com.github.refactor.RefactorNumbers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static Faramish.com.github.refactor.RefactorNumbers.isNumeric;
import static Faramish.com.github.refactor.RefactorNumbers.convertToDouble;

@RestController
@RequestMapping("/math")
public class MathController {

    // http://localhost:8080/math/sun/3/5
    @RequestMapping("/sun/{number1}/{number2}")
    public Double sun(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {
        if(!isNumeric(number1) || isNumeric(number2))
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        return convertToDouble(number1) + convertToDouble(number2);
    }

    // http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{number1}/{number2}")
    public Double subtraction(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {
        if(!isNumeric(number1) || !isNumeric(number2))
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        return convertToDouble(number1) - convertToDouble(number2);
    }


    // http://localhost:8080/math/multiplication/3/5
    @RequestMapping("/multiplication/{number1}/{number2}")
    public Double multiplication(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {
        if(!isNumeric(number1) || !isNumeric(number2))
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        return convertToDouble(number1) * convertToDouble(number2);
    }

    // http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{number1}/{number2}")
    public Double division(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {
        if(!isNumeric(number1) || !isNumeric(number2))
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        return convertToDouble(number1) / convertToDouble(number2);
    }

    // http://localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{number1}/{number2}")
    public Double mean(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {
        if(!isNumeric(number1) || !isNumeric(number2))
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        return (convertToDouble(number1) + convertToDouble(number2)) / 2;
    }

    // http://localhost:8080/math/squareRoot/81
    @RequestMapping("/squareRoot/{number1}")
    public Double squareRoot(@PathVariable("number1") String number1) throws Exception {
        if(!isNumeric(number1))
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        return Math.sqrt(convertToDouble(number1));
    }

}
