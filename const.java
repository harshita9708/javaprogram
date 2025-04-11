 class calc {
    int num1;
    int num2;
    clac(){
        num1=5;
        num2=10;
        System.out.println("Inside constructor");
    }
    public class const{
        public static void main(String[] args) {
            calc obj=new calc();
            System.out.println(obj.num1);
            System.out.println(obj.num2);

        }
    }
}
