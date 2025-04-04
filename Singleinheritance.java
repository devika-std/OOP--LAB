class InheritanceDemo 
{
    int rollno=10;
    String name="Devika";
}
class ChildInheritance extends InheritanceDemo
{
    
    int marks=80;
    void display()
        {
            System.out.println("Roll No:"+rollno);
            System.out.println("Name:"+name);
            System.out.println("Marks:"+marks);
        }   
}
class Singleinheritance   
{
    public static void main(String[] args) 
    {
        ChildInheritance ob=new ChildInheritance();
        ob.display();    
    }
    
}  


