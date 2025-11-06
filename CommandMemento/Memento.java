package com.calculator;
public class Memento {
    private final double savedValue;
    public Memento(double value) { this.savedValue = value; }
    public double getSavedValue() { return savedValue; }
}
