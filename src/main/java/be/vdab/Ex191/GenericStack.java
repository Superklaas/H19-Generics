package be.vdab.Ex191;

public class GenericStack<E> {

    private E[] array = (E[])new Object[3];

    public GenericStack() {
    }

    public int getSize() {
        return array.length;
    }

    public E peek() {
        E topOfStack = null;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == null) {
                topOfStack = array[i-1];
                break;
            }
        }
        return topOfStack;
    }

    public void push(E object) {
        // check array is full
        boolean arrayFull = true;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                arrayFull = false;
                break;
            }
        }
        // array not full: push object to first empty position in array
        if (arrayFull == false) {
            for (int i = 0; i < array.length; i++) {
                if(array[i] == null) {
                    array[i] = object;
                    break;
                }
            }
        }
        // array full: make new double-sized array and fill it up
        else {
            E[] newArray = (E[])new Object[array.length*2];
            for (int j = 0; j < array.length; j++) {
                newArray[j]=array[j];
            }
            newArray[array.length]=object;
            this.array = newArray;
        }
    }


    public E pop() {
        E poppedObject = null;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                poppedObject = array[i-1];
                array[i-1] = null;
                break;
            }
        }
        return poppedObject;
    }

    public boolean isEmpty() {
        boolean isEmpty = true;
        for (Object o: array) {
            if(o != null) {
                isEmpty = false;
            }
            break;
        }
        return isEmpty;
    }

    @Override
    public String toString() {
        return "stack: " + array.toString();
    }

}

