package ru.pupkin.calculator;

class Params {
    private double first;
    private double second;
    private Operation operation;
    private String operation_name;

    Params(double first, double second, Operation operation) {
        this.first = first;
        this.second = second;
        this.operation = operation;
    }

    /**
     * геттер
     * @return first - значение первого параметра
     */
    final double getFirst() {
        return first;
    }

    /**
     * сеттер
     * @param first  - значение первого параметра
     */
    final void setFirst(double first) {
        this.first = first;
    }

    /**
     * геттер
     * @return second - значение второго параметра
     */
    final double getSecond() {
        return second;
    }

    /**
     * сеттер
     * @param second - значение второго параметра
     */

    final void setSecond(double second) {
        this.second = second;
    }

    /**
     * геттер
     * @return operation - код операции
     */
    final Operation getOperation() {
        return operation;
    }

    /**
     * геттер
     * @param operation  - код операции
     */
    final void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * геттер
     * @return operation_name - имя операции
     */
    final String getOperation_name() {
        return operation_name;
    }

    /**
     * геттер
     * @param operation_name  - имя операции
     */
    final void setOperation_name(String operation_name) {
        this.operation_name = operation_name;
    }
}
