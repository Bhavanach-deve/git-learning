import java.util.*;
class Merit
{
    double percentage;
    static String collageName;
    int rollNo;
    double cgpa;

    void enterpercentage()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly enter the percentage");
        percentage=sc.nextDouble();
        System.out.println("Enter Collage Name");
        collageName=sc.next();
        System.out.println("Enter Roll No");
        rollNo= sc.nextInt();
    }
    void calculate()
    {
        cgpa = percentage / 9.5;
    }
    void disp()
    {
        System.out.println("Your cgpa is:"+cgpa);
    }
    void eligible()
    {
        if(cgpa>7.5){
            System.out.println("Congratulations your are eligible for Merit Scholarship!");
        }
        else{
            System.out.println("Work more hard buddy! Wish you all the best. Hope you grab the scholarship next-time!");
        }
    }
}

public class Scholarship
{
    public static void main(String[] args)
    {
        Merit m1=new Merit();
        Merit m2=new Merit();
        Merit m3=new Merit();
        System.out.println("Student1:");
        m1.enterpercentage();
        m1.calculate();
        m1.disp();
        m1.eligible();
        System.out.println("Student2:");
        m2.enterpercentage();
        m2.calculate();
        m2.disp();
        m2.eligible();
        System.out.println("Student3:");
        m3.enterpercentage();
        m3.calculate();
        m3.disp();
        m3.eligible();

    }
}