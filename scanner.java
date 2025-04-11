import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        int x,y,z=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter operand1 ");
        x=scan.nextInt();
        System.out.println("Enter operand2 ");
        y=scan.nextInt();
        System.out.println("Enter opernd which you want to prefer(+,-,*,/)");
        String op=scan.next();
        scan.close();
        if(op.equals("+"))
        {
            z=x+y;
        }
        else if(op.equals("-"))
        {
            z=x-y;
        }
        else if(op.equals("*"))
        {
            z=x*y;
        }
        else if(op.equals("/"))
        {
            z=x/y;
        }
        else {
            System.out.println("Invalid operator");
        }
        System.err.println(z);
    }}

