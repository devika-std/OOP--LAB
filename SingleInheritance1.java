 class Inheritance   
{
    int id=1;
    String ename="Dev"; 
}
class Child extends Inheritance
{
    int age=21;
    void putdata()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+ename);
        System.out.println("Age:"+age);
    }
}

class SingleInheritance1 
{
    public static void main(String[] args) 
    {
        
        Child ob=new Child();
        ob.putdata();
    }
}    
