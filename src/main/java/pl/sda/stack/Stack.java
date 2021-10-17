package pl.sda.stack;

import java.util.Arrays;

public class Stack {

    private static final Integer INITIAL_CAPACITY = 4;

    private Integer elementCounter;
    private Integer[] array;

    public Stack() {
        this.elementCounter = 0;
        this.array = new Integer[INITIAL_CAPACITY];
    }

    public void push(Integer element) {
        if (elementCounter == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[elementCounter++] = element;
    }

    public boolean isEmpty() {
        return elementCounter == 0;
    }

    public Integer top() {
        if (elementCounter == 0) {
            return null;
        }
        return array[elementCounter - 1];
    }

    public Integer pop() {
        if (elementCounter < array.length / 2) {
            array = Arrays.copyOf(array, array.length / 2);
        }

        Integer last = top();
        array[elementCounter - 1] = null;
        elementCounter--;
        return last;
    }

    public Integer size() {
        return elementCounter;
    }

    public Integer length() {
        return array.length;
    }
}
