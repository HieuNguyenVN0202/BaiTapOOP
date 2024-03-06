package Interface;

import Interface.Animal.Animal;
import Interface.Animal.Chicken;
import Interface.Animal.Tiger;
import Interface.Edible.Edible;
import Interface.Fruit.Apple;
import Interface.Fruit.Fruit;
import Interface.Fruit.Orange;


// Quan hệ is-a (quan hệ thừa kế) trong oop
// Là mối quan hệ giữa lớp con và lớp cha
// Lớp con is-a lớp cha, tức là nó kế thừa tất cả thuộc tính và phương thức của lớp cha

// Quan hệ has-a
// Là mối quan hệ giữa 1 lớp và 1 đối tượng khác mà nó chứa
// Chứa 1 tham chiếu đến đối tượng khác đc gọi quan hệ has-a


public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }



        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}