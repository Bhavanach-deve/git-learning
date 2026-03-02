class CulturalFood{
    public void celeberatedFood(){
        System.out.println("Which food is celebrated food of Telangana");
    }
    public void Beverages(){
        System.out.println("A beverage which is a Stress-reliver for most of Telangana?");
    }
    public void FastFood(){
        System.out.println("Under-Rated food of Telangana");
    }
}
class HyderabadiFood extends CulturalFood{
    public void celeberatedFood(){
        System.out.println("Biryani is the most celebrated dish across Hyd");
    }
    public void Beverages(){
        System.out.println("The stress-reliver for wide variety of people is tea");
    }
    public void FastFood(){
        System.out.println("Idly and vada-pav are the under-Rated food in Hyd");
    }
}
class WarangalFood extends CulturalFood{
    public void celeberatedFood(){
        System.out.println("Sarva Pindi is the most celebrated dish across Warangal");
    }
    public void Beverages(){
        System.out.println("The stress-reliver for wide variety of people is Toddy-'kalu'");
    }
    public void FastFood(){
        System.out.println("Sakinalu and Manchuria are the under-Rated food in Warangal");
    }
}
class KarimnagarFood extends CulturalFood{
    public void celeberatedFood(){
        System.out.println("Sarva-Pindi are the most celebrated dish across Karimnagar");
    }
    public void Beverages(){
        System.out.println("The stress-reliver for wide variety of people is ButterMilk");
    }
    public void FastFood(){
        System.out.println("Dry-Fruits Laddu are the under-Rated food in Karimnagar");
    }
}
class Foodie{
    public void dishes(CulturalFood cf)//Polymorphism
    {
        cf.celeberatedFood();
        cf.Beverages();
        cf.FastFood();

    }
}
public class Food
{
    public static void main()
    {
        HyderabadiFood hf= new HyderabadiFood();
        WarangalFood wf=new WarangalFood();
        KarimnagarFood kf=new KarimnagarFood();
        Foodie f =new Foodie();
        f.dishes(hf);
        System.out.println("************************************************************");
        f.dishes(wf);
        System.out.println("*************************************************************");
        f.dishes(kf);

    }
}
