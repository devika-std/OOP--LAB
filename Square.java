public class Square 
{

    int s;
    void getinput(int side)
    {
        s=side;
    }
    int calArea()
    {
        return s*s;
    }
    public static void main(String[] args)
     {
        Square m=new Square();
        m.getinput(6);
        System.out.println("Area  is square is :"+m.calArea());
        
    }
}
