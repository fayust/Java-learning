//изменено
public class Bird
{
    public int weight;
    public String color;

    //Конструктор объекта позволяет инициализировать поля объекта во время его создания
    public Bird(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }

    public void fly(String Addition)
    {
        System.out.println("I can fly" + Addition);
    }

    public int FlyBack(int val)
    {
        return val*2;
    }
}
