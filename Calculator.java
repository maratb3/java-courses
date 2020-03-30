package ru.pupkin.calculator;

/**
 * Класс реализует калькулятор
 * @version 1.0
 * @author Вася Пупкин
 */
public class Calculator implements ICalculator{
    /**
     *  Результат вычисления
     */
    private double result;
     /**
     *  Суммируем аргументы
     * @param first  - Первый аргумент операции
     * @param second - Второй аргумент операции
     */
    @Override
    public final void add(final double first, final double second){
        this.result = first + second;
    }
     /**
     *  Вычитаем аргументы
     * @param first  - Первый аргумент операции
     * @param second - Второй аргумент операции
     */
     @Override
     public final void subtract(final double first, final double second){
         this.result = first - second;
     }
     /**
     *  Делим аргументы
     * @param first  - Первый аргумент операции
     * @param second - Второй аргумент операции
     */
     @Override
     public final void div(final double first, final double second){
         if (second != 0d) {
             this.result = first / second;
         } else {
             throw new ArithmeticException("Could not div by 0");
         }
     }
     /**
     *  Умножаем аргументы
     * @param first  - Первый аргумент операции
     * @param second - Второй аргумент операции
     */
     @Override
     public final void multiple(final double first, final double second){
         this.result = first*second;
     }
     /**
     *  Возводим в степень аргументы
     * @param first  - Аргумент операции
     * @param second - Степень
     */
     @Override
     public final void exp(final double first, final double second){
         this.result = 1;
         for(double index=second;index>0;index--){
             this.result *= first;
         }
     }
    /**
     *  Получить результат.
     * @return result - результат вычисления
     */
    @Override
    public final double getResult(){
        return this.result;
    }
    /**
     *  Очистить результат вычисления
     */
    @Override
    public final void cleanResult(){
        this.result = 0;
    }

    @Override
    public final void calc(Params params){
        switch (params.getOperation()) {
            case ADD:         // Сложить
                this.add(params.getFirst(), params.getSecond());
                break;
            case SUBTRACT:   // Вычесть
                this.subtract(params.getFirst(), params.getSecond());
                break;
            case MULTIPLE:    // Умножить
                this.multiple(params.getFirst(), params.getSecond());
                break;
            case DIV:         // Делить
                this.div(params.getFirst(), params.getSecond());
                break;
            case EXP:         // Возвести в степень
                this.exp(params.getFirst(), params.getSecond());
                break;
            case CLEAR:       // Очистить
                this.cleanResult();
                break;
            case EXIT:       // Очистить
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }
}