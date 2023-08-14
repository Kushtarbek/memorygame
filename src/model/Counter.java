package model;

public class Counter {
    private final int DEFAULT_VALUE = 0;
    private int counter;

    public Counter(){
        this.counter = DEFAULT_VALUE;
    }

    public void increment(){
        counter++;
        setChanged();
        notifyObservers();
    }

    public int getCounter(){
        return counter;
    }

    public void reset(){
        counter = DEFAULT_VALUE;
        setChanged();
        notifyObservers();
    }


}
