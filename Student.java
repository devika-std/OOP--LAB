public class Student 
{
    void getinput(int rollno)
    {
        System.out.println("Roll no="+rollno);
    }
}
class RollNo
{
    public static void main(String[] args) 
    {
        Student st=new Student();
        st.getinput(21);        
    }
}
