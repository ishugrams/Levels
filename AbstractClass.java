import java.util.*;

    abstract class Animal
    {

        public abstract void sound();
    }
    class Dog extends Animal
    {
        public void sound()
        {
            System.out.println("Dog is Barking");
        }

    }
    class Loin extends Animal
    {
        public void sound()
        {
            System.out.println("Lion is Roar");
        }

    }
class AbstractClass
{

    public static void main(String arg[])
    {
        Dog d = new Dog();
        Loin l = new Loin();
        d.sound();
        l.sound();
    }
}