package HeadFirst;

public class AnimalTestDrive {
    public static void main(String[] a)
    {
        MyAnimalList list = new MyAnimalList();
        Dog d = new Dog();
        Cat c = new Cat();
        list.add(d);
        list.add(c);
        d.getClass();
    }
}
