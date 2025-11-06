package com.calculator;
public class Calculator {
    private double currentValue = 0;
    public double getValue() { return currentValue; }
    public void setValue(double v) { this.currentValue = v; }
    public Memento createMemento() { return new Memento(currentValue); }
    public void restore(Memento m) { this.currentValue = m.getSavedValue(); }
}
