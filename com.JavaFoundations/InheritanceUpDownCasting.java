class School
{
    public void classRoom(){
        System.out.println("I'm equiped with many Class Rooms for Students");
    }
    public void faculty(){
        System.out.println("I have good teaching staff!");
    }
    public void students(){
        System.out.println("Students are must for any institute");
    }
    public void playGround(){
        System.out.println("Consists of well equiped play area!");
    }
}
class Collage extends School{
    public void library()
    {
        System.out.println("I have a wide collections of books that are accessible for students");
    }
}
public class InteritanceUpDownCasting
{
    public static void main()
    {
        School s=new Collage(); //upcasting: parent type of reference child type of object
        s.students();
        s.faculty();
        ((Collage)s).library(); //downcasting: temporarily changing parent type behaviour to child type so that they can access child's specialized behaviour!



    }
}
