package com.calculator;
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        CommandManager manager = new CommandManager();
        manager.execute(new AddCommand(calc, 10));
        manager.execute(new MultiplyCommand(calc, 2));
        manager.execute(new SubtractCommand(calc, 4));
        System.out.println("Resultado: " + calc.getValue());
        manager.undo();
        System.out.println("Undo → " + calc.getValue());
        manager.undo();
        System.out.println("Undo → " + calc.getValue());
        manager.redo();
        System.out.println("Redo → " + calc.getValue());
    }
}
