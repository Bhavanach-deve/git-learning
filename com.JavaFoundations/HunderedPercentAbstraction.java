interface Sport{                                //Interface---100% abstraction
    void nameOfTheSport();
    void noOfPlayers();
    void famousIn();
}
class Cricket implements Sport
{
    public void nameOfTheSport(){
        System.out.println("Cricket");
    }
    public void noOfPlayers(){
        System.out.println("This sport consists of 11 members in a team");
    }
    public void famousIn(){
        System.out.println("This sport has got more craze from India");
    }

}
class Football implements Sport {
    public void nameOfTheSport() {
        System.out.println("Football");
    }

    public void noOfPlayers() {
        System.out.println("This sport consists of 11 members in a team");
    }

    public void famousIn() {
        System.out.println("This sport have got more craze from Brazil");
    }
}
class Badminton implements Sport {
    public void nameOfTheSport() {
        System.out.println("Badminton");
    }

    public void noOfPlayers() {
        System.out.println("This sport can be played among two/four players, with one/two players on each team");
    }

    public void famousIn() {
        System.out.println("This sport have got more craze from Indonesia, India, China and Malaysia");
    }
}
class OutDoor{
    public void game(Sport s){
        s.nameOfTheSport();
        s.noOfPlayers();
        s.famousIn();
    }
}

public class HunderedPercentAbstraction
{
    public static void main()
    {
        Cricket c=new Cricket();
        Football fb= new Football();
        Badminton b=new Badminton();
        OutDoor od=new OutDoor();
        od.game(c);
        System.out.println("----------------------------------------------------");
        od.game(fb);
        System.out.println("----------------------------------------------------");
        od.game(b);

    }
}
