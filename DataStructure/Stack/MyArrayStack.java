package Stack;

public class MyArrayStack {
    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.removeElement(--top);
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.getElement(--top);
    }

    public boolean isEmpty() {
        if (top == 0) return true;
        return false;
    }

    public boolean isFull() {
        if(top == arrayStack.ARRAY_SIZE) return true;
        return false;
    }

    public void printAll() {
        arrayStack.printAll();
    }
}
