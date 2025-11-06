package com.calculator;
public class ClearCommand implements Command {
    private Calculator calculator;
    private Memento backup;
    public ClearCommand(Calculator calculator) { this.calculator = calculator; }
    @Override
    public void execute() {
        backup = calculator.createMemento();
        calculator.setValue(0);
    }
    @Override
    public void undo() { calculator.restore(backup); }
}
