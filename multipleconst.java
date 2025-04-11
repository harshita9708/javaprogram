class calc{
    int num1;
    int num2;
    public clac()
    {
        num1=10;
        num2=10;
        System.out.println("No parameter constructor");
    }
    public calc(int  n,int m)
    {
        num1=n;
        num2=m;
        System.err.println("Parameterized constructor");
    }
}
public class multipleconst {
    public static void main(String[] args) {
        calc obj=new multipleconst();
        calc obj2=new multipleconst(7,6);
        System.err.println(obj.num1);
        System.err.println(obj.num2);
        System.err.println(obj.num1);
        System.err.println(obj.num2);


    }
}
