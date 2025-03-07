import java.util.Scanner;
public class Student1 
{
    int roll_no,m1,m2,m3;
    String name;
    int total;
    float average;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\nEnter Student name,roll no and marks of 3 subject ");
        name=scan.nextLine();
        roll_no=scan.nextInt();
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
    }
    void cal()
    {
        total=m1+m2+m3;
        average=total/3.0f;
        System.out.println("Total marks:"+total);
        System.out.println("Average :"+average);
    }
    public static void main(String[] args)
     {
        Student1 r=new Student1();
        r.getdata(); 
        System.out.println("\nSTUDENT DETAILS");
        System.out.println("Name:"+r.name);
        System.out.println("Roll no:"+r.roll_no);
        r.cal();  
    }

}
