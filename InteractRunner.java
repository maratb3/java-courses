package ru.pupkin.calculator;

import java.util.Scanner;

/**
 *  Класс для запуска калькулятора. Поддерживает ввод пользователя.
 */
class InteractRunner {

    void run() {
        final Calculator calc = new Calculator();
        final Scanner reader = new Scanner(System.in);
        final Params params = new Params(0, 0, Operation.CLEAR);
        final Menu menu = new Menu(reader, params);
        Operation previous_operation = Operation.CLEAR;

        try {
            do {
                menu.show(params);
                // Произвести вычисление с полученным результатом
                if(params.getOperation()!= Operation.REUSE) {
                    previous_operation = params.getOperation();}
                else {
                    params.setSecond(calc.getResult());
                    params.setOperation(previous_operation);
                }
                calc.calc(params);
                menu.show_result(calc, params);
            } while (params.getOperation() != Operation.EXIT);
        } finally {
            reader.close();
        }
    }
}
