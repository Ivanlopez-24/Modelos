package com.calculator;
public class SubtractCommand implements Command {
    private Calculator calculator;
    private double value;
    private Memento backup;
    public SubtractCommand(Calculator calculator, double value) {
        this.calculator = calculator;
        this.value = value;
    }
    @Override
    public void execute() {
        backup = calculator.createMemento();
        calculator.setValue(calculator.getValue() - value);
    }
    @Override
    public void undo() { calculator.restore(backup); }
}
