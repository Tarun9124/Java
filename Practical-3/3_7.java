class stack
{
    int stk[] = new int[10];
    int top;

    stack()
    {
        top = -1;
    }

    void push(int i)
    {
        if(top == 9)
        System.out.println("Stack is Overflow.");
        else stk[++top] = i;
    }

    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack is underflow");
            return 0;
        }
        else return stk[top--];
    }
}

class stackcheck
{
    public static void main(String args[])
    {
        stack s = new stack();
        System.out.println("Pushed Element.");
        for(int i=0;i<10;i++)
        {
            s.push(i);
            System.out.println(i + " ");
        }

        System.out.println("Poped Element.");
        for(int i=0;i<10;i++)
            System.out.println(s.pop() + " ");
    }
}