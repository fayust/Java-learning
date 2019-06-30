public class TestClass {
    private void print() {
        System.out.println("1");
    }
}

class Child extends TestClass {

    private void print() {
        System.out.println("2");
    }
    public static void main(String[] args) {
        TestClass obj = new Child();
      //  obj.print();
    }
}
