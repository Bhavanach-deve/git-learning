class Construct{
    int num1; //INSTANCE
    int num2; //VARIABLE
    public Construct()
    {
        super();//calls the constructor of the parent class.
        System.out.println("Zero-parameterized constructor");
    }
    public Construct(int num1,int num2)
    {
        this(); //Calls the zero-parameterized constructor of the same class
        this.num1=num1;
        this.num2=num2;
        System.out.println("This is parameterized constructor");
    }
    public Construct(int num1)
    {
        this(100,48); //As we are passing two parameters here therefore this will call the 2-parameterized constructor of the same class.
        System.out.println("This is one-parameterized constructor");
    }
    void disp()
    {
        num1=100;
        num2=69;
        int res=num1-num2;
        System.out.println(res);
    }
}
public class Constructors {

    public static void main(String[] args)
    {
        Construct c=new Construct(20);
        c.disp();
    }
}
