class Constructor{
    int id;
    String name;
    String city;

    public Constructor()
    {
        System.out.println("Hi from zero-parameterized constructor");
    }
    public Constructor(int id, String name, String city)
    {
        super();
        this.id=id;
        this.name=name;
        this.city=city;
        System.out.println("Hi From a parameterized constructor");

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
public class ConSetGet {
    public static void main(String[] args)
    {
        Constructor c=new Constructor();
        c.setId(1);
        c.setName("Ch_Bhavana");
        c.setCity("Hyderabad");
        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getCity());
        System.out.println("----------------------------------------------");
        Constructor c1=new Constructor(2,"Aryan","Hyderabad");//First data
        c1.setId(3); //2nd data i.e the constructors data is modified later through setter!
        c1.setName("Anil");
        c1.setCity("Andhra Pradesh");
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getCity());
        System.out.println("The only difference b/w these two constructors is time of setting the data is different (i.e) time of data insertion is different");


    }
}
