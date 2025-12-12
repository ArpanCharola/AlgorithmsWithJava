package Stacks;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);  
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws stackException{
        if(isEmpty()){
            throw new stackException("Cannot pop element from empty stack!");
        }
        //int removed = data[ptr];
        //ptr--;
        //return removed;
        return data[ptr--];
    }

    public int peek() throws stackException{
        if(isEmpty()){
            throw new stackException("Cannot peek element from empty stack!");
        }
        return data[ptr];
    }

    private boolean isFull(){
        return ptr == data.length - 1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
}  