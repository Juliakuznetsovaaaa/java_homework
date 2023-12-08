package _03;
public class _6_stack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()); //3
        System.out.println(stack.pop()); //3
        System.out.println(stack.pop()); //2
        System.out.println(stack.isFull()); //false
        System.out.println(stack.pop()); //1
        System.out.println(stack.isEmpty()); //true

    }
}
class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) { //добавление элемента
        stackArray[++top] = value;
    }

    public int pop() { //извлечение элемента
        return stackArray[top--];
    }

    public int peek() { //получение верхнего элемента стека
        return stackArray[top];
    }

    public boolean isEmpty() {//проверка пустоты стека
        return (top == -1);
    }

    public boolean isFull() {//проверка полноты стека.
        return (top == maxSize - 1);
    }
}
