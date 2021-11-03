class Animal {
    String sound;
    String animal_type;

    public void Animal(String animal_type) {
        animal_type = animal_type;
    }
}

class Dog extends Animal {
    String name = "I don't have any name";
    Dog() {
        sound = "Bark Bark!";
        Animal("Dog");
    }
    Dog(String n) {
        this();
        name = n;
    }
   
    public void speak() {
        System.out.println(sound);
    }
}

