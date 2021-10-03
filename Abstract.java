abstract class Animal {
    int legs = 0;
    abstract void makeSound();
}

class Cat extends Animal {
     public void makeSound() {
           System.out.println("Meow");
     }
}

