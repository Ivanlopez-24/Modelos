package com.calculator;
public class AddCommand implements Command {
    private Calculator calculator;
    private double value;
    private Memento backup;
    public AddCommand(Calculator calculator, double value) {
        this.calculator = calculator;
        this.value = value;
    }
    @Override
    public void execute() {
        backup = calculator.createMemento();
        calculator.setValue(calculator.getValue() + value);
    }
    @Override
    public void undo() { calculator.restore(backup); }
}
