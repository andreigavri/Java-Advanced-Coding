package ro.sda._4_generics._3_thirdExample;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
    private List<T> elements;

    public Stack() {
        elements = new ArrayList<>();

    }

    public void push(T elements) {
        this.elements.add(elements);


    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();

        }
        return elements.remove(elements.size()-1);
    }

    public T peek(){
        if(elements.isEmpty()){
            throw new EmptyStackException();
        }
        return elements.get(elements.size()-1);

    }
    public boolean isEmpty(){
        return elements.isEmpty();
        
    }
}

