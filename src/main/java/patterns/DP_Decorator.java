public class DP_Decorator {
    public static void main(String[] args) {
        //PrinterInterface printer = ;
        PrinterInterface printer = new QuotesDecorator(new Printer("Привет"));
        printer.print();
    }
}

interface PrinterInterface {
    void print();
}

class Printer implements PrinterInterface {
    String value;
    public Printer(String value) {
        this.value = value;
    }
    public void print() {
        System.out.print(value);
    }
}
//Добавляет кавычку вначале и в конце
class QuotesDecorator implements PrinterInterface {
    PrinterInterface component;
    public QuotesDecorator(PrinterInterface component) {
        this.component = component;
    }
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
