package ru.pupkin.calculator;

import java.util.Scanner;

enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLE,
    DIV,
    EXP,
    REUSE,
    CLEAR,
    EXIT
}

class Menu {

    private Scanner reader;

    /**
     * Конструктор
     * @param reader - объект для чтение ввода пользователя
     * @param params - объект с параметрами
     */
    Menu(Scanner reader, Params params) {
        this.reader = reader;
    }

    /**
     * Показываем меню на экран
     * @param  params - объект с параметрами
     * @return params - объект с параметрами
     */
    final Params show(Params params){

        int command;

        System.out.println(
                "1. Сложить\n" +
                "2. Вычесть\n" +
                "3. Умножить\n" +
                "4. Делить\n" +
                "5. Произвести вычисление с полученным результатом\n" +
                "6. Очистить\n" +
                "0. Выйти из калькулятора\n");

        do {
            System.out.print("Введите команду: ");
            command = Integer.parseInt(reader.next());
        } while((command > 6) || (command < 0));

        switch (command) {
            case 1:
                params.setOperation(Operation.ADD);
                params.setOperation_name("Сложение");
                break;
            case 2:
                params.setOperation(Operation.SUBTRACT);
                params.setOperation_name("Вычитание");
                break;
            case 3:
                params.setOperation(Operation.MULTIPLE);
                params.setOperation_name("Умножение");
                break;
            case 4:
                params.setOperation(Operation.DIV);
                params.setOperation_name("Деление");
                break;
            case 5:
                params.setOperation(Operation.REUSE);
                params.setOperation_name("Использование результата");
                break;
            case 6:
                params.setOperation(Operation.CLEAR);
                params.setOperation_name("Очистка");
                break;
            case 0:
                params.setOperation(Operation.EXIT);
                params.setOperation_name("Выход");
                break;
        }

        if (params.getOperation() != Operation.EXIT) {
            System.out.print("Введите первый параметр: ");
            params.setFirst(Double.parseDouble(reader.next()));
            if (params.getOperation() != Operation.REUSE) {
                System.out.print("Введите второй параметр: ");
                params.setSecond(Double.parseDouble(reader.next()));
            }
        }
        return params;
    }

    /**
     * Показываем результат на экран
     * @param calc - объект калькулятора
     * @param params - объект с параметрами
     */
    final void show_result(Calculator calc, Params params){
        if(params.getOperation() != Operation.EXIT) {
            System.out.println(
                    "результат операции \"" + params.getOperation_name() + "\" (" +
                            params.getFirst() +
                            ", " +
                            params.getSecond() +
                            ") = " +
                            calc.getResult()
            );
        } else {
            System.out.println("Завершение.");
        }
    }


}
