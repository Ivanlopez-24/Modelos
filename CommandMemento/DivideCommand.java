package com.calculator;
public class DivideCommand implements Command {
    private Calculator calculator;
    private double value;
    private Memento backup;
    public DivideCommand(Calculator calculator, double value) {
        this.calculator = calculator;
        this.value = value;
    }
    @Override
    public void execute() {
        backup = calculator.createMemento();
        if (value != 0) calculator.setValue(calculator.getValue() / value);
        else System.out.println("Error: división por cero");
    }
    @Override
    public void undo() { calculator.restore(backup); }
}
