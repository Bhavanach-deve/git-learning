class Bangles
{
    public Bangles round()
    {
        Bangles b= new Bangles();
        System.out.println("Bangles are round in shape");
        return b;
    }
}
class Bracelets extends Bangles
{
    public Bracelets round()  //while over-riding we can't change return type //Covariant return types are such retuen types where there is a relationship
    {
        Bracelets bc =new Bracelets();
        System.out.println("Bracelets are round in shape and differes from person's wrist to wrist");
        return bc;

    }
}
public class CovariantRetunType
{
    public static void main() {
        new Bracelets().round();

    }
}
