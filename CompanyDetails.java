class Manager
{
    int salary=100000;
}
class TeamLead extends Manager
{
    String teamname="Dev";
}
class Developer extends TeamLead
{
    int prjcid=10001;
    void putdata()
    {
        System.out.println("Salary="+salary);
        System.out.println("Teamname="+teamname);
        System.out.println("Project ID="+prjcid);
    }
}

public class CompanyDetails
{
    public static void main(String[] args) 
    {
         Developer ob=new Developer();
        ob.putdata();
    }
}
