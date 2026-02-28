class Statics{
    static int a,b;
    int c,d,e;
    static
    {
        System.out.println("Hi from static block");
        a=10;
        b=100;
        System.out.println("a is" + a);
        System.out.println("b is"+b);
    }
    static void disp(){
        int res=a+b;
        System.out.println(res);
        System.out.println("Hey! I am a static method");

    }

}
public class NoObjectCreation {
    public static void main(String[] args) {
        Statics.disp();//You can call the static method just by mentioning it's class name and calling it's methods. Hence there by no object creation is needed.
    }
}
