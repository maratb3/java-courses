package ru.pupkin.calculator;

/**
 * Калькулятор Данные вводятся через консоль.
 */
public class ArgRunner {
    public void run(String[] args) {
        final Params params = new Params(0, 0, Operation.CLEAR);
        final Calculator calc = new Calculator();

        params.setFirst(Double.parseDouble(args[0]));
        params.setSecond(Double.parseDouble(args[2]));

        if     (args[1].equals("m")) { params.setOperation(Operation.MULTIPLE);}
        else if(args[1].equals("-")) { params.setOperation(Operation.SUBTRACT);}
        else if(args[1].equals("+")) { params.setOperation(Operation.ADD);}
        else if(args[1].equals("/")) { params.setOperation(Operation.DIV);}
        else if(args[1].equals("e")) { params.setOperation(Operation.EXP);}
        else throw new UnsupportedOperationException();

        calc.calc(params);

        System.out.println(String.format("%s %s %s = %s", args[0], args[1], args[2], calc.getResult()));
    }
}
