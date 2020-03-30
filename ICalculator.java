package ru.pupkin.calculator;

/**
 * @author Marat Batyrov
 * @since 25.03.2020
 */

public interface ICalculator {
    void add(double first, double second);
    void subtract(double first, double second);
    void div(double first, double second);
    void multiple(double first, double second);
    void exp(double first, double second);
    double getResult();
    void cleanResult();
    void calc(Params params);
}
