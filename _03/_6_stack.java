package _03;
public class _6_stack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek()); //4
        System.out.println(stack.pop()); //4
        System.out.println(stack.pop()); //3
        System.out.println(stack.pop()); //2
        System.out.println(stack.isEmpty()); //false
        //базовый размер = 3, но наш размер 4, значит стек заполняется вне зависимости от начальных данных
    }
}
class ArrayStack {
    private int[] stackArray;
    private int top;
    private static final int DEFAULT_SIZE = 3;

    public ArrayStack() {
        stackArray = new int[DEFAULT_SIZE];
        top = -1;
    }

    public void push(int value) { //добавление элемента
        if (top == stackArray.length - 1) {
            expandStack();
        }
        stackArray[++top] = value;
    }

    public int pop() { //извлечение элемента
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return stackArray[top--];
    }

    public int peek() { //получение верхнего элемента стека
        return stackArray[top];
    }

    public boolean isEmpty() {//проверка пустоты стека
        return (top == -1);
    }
    //метод увеличения размера стека
    public void expandStack() {
        int newCapacity = stackArray.length * 2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stackArray, 0, newStack, 0, stackArray.length);
        stackArray = newStack;
    }
}
