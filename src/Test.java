public class Test implements InterfaceF1,InterfaceF2{

   // @Override
    public void show() {
       InterfaceF1.show();
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        System.out.printf("Hello and welcome!");
    }
}
