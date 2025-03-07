import java.util.Scanner;
public class EmpNetPay 
{
    int empid,TA,DA,HRA,Tax,netsal,basic;
    String empname;
    void getdata()
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter employe name,id,Basic pay,TA,DA,HRA,Tax");
        empname=scan.nextLine();
        empid=scan.nextInt();
        basic=scan.nextInt();
        TA=scan.nextInt();
        DA=scan.nextInt();
        HRA=scan.nextInt();
        Tax=scan.nextInt();
    }
    void calc()
    {
        netsal=(basic+TA+DA+HRA)-Tax;
        System.out.println("Net salary:"+netsal);
    }
    public static void main(String[] args)
     {
       EmpNetPay e1=new EmpNetPay();
       e1.getdata();
       System.out.println("\nEMPLOYE DETAILS"); 
       System.out.println("--------------------");
       System.out.println("Employe ID:"+e1.empid);
       System.out.println("Emplpye name:"+e1.empname);
       e1.calc();
    }

    
}
