package Task4;

public class Animal {

    private int id;
    String name;
    int age;
    boolean tail;

    public Animal(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Name: Vas'ka, age: 45, tail: soen't have.");
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal(12);
        Animal animal2 = new Animal(15);
        Animal animal3 = animal1;

        System.out.println(animal1.equals(animal3));
        System.out.println(animal3.equals(animal2));

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println(animal3.hashCode());

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}
