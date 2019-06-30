/**
 * //Это шаблон проектирования Шаблонный метод. Он решает проблему копипаста
 */
public class DPTemplateMethod {

    public static  void  main(String[] args) {
        C a = new A();
        a.templateMethod();

        //System.out.println();

        a = new B();
        a.templateMethod();

    }
}



abstract class C {
    void templateMethod() {
        System.out.print(("1"));
        differ();
        System.out.print(("3"));
        differ2();
    }
    abstract void differ();
    abstract void differ2();
}

/**
 * Те куски, что различаются мы выделяем в отдельный differ()
 */
class A extends C {
    void differ() {
        System.out.print("2");
    }
    void differ2() {
        System.out.print("9999");
    }
}

class B extends C {
    void differ() {
        System.out.print("77");
    }

    void differ2() {
    }
}


