public class student{
    String name;
    int age;
    String srn;
    public student (int a, String n,String s)
    {
        name=n;
        age=a;
        srn=s;
    }
    public void display(){
        System.out.println("Name= "+(name));
        System.out.println("Age= "+(age));
        System.out.println("SRN= "+(srn));

    }
    public static void main(String[] args)
    {
        student s= new student(10,"harshita" ,"01fe23bca154");
        s.display();
    }
}