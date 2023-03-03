package ru.muctr.Exceptions.CustomException;

/**
 * @author Evgenia Skichko
 */
//пример пользовательского класса исключения
public class NumberInvalidForFactorialException extends Exception {
    int value;
    NumberInvalidForFactorialException (int val){
        value = val;
    }
    NumberInvalidForFactorialException (String message){
        super(message);
    }

    @Override
    public String toString() {
        return "Невозможно рассчитать факториал числа " + value;
    }
}
