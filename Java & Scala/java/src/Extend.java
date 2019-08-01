public class Extend {
    int a=90;
}
class cl2 extends Extend{
    int a=150;
    public static void main(String args[]){
        Extend obj=new cl2();
        System.out.println(obj.a);
    }
}
