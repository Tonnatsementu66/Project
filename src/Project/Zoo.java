package Project;

public class Zoo {
    interface AnimalBehavior {
        void eat();
        void sleep();
        void makeSound();
    }
    abstract static class Animal implements AnimalBehavior {
        protected String name;
        protected int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        // Abstract method to display information about the animal
        public abstract void displayInformation();
    }
    static class Mammal extends Animal {
        public Mammal(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating as a mammal.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " makes a mammal sound.");
        }

        @Override
        public void displayInformation() {
            System.out.println("Mammal Name: " + name + ", Age: " + age);
        }
    }
    static class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is pecking food as a bird.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " chirps or squawks.");
        }

        @Override
        public void displayInformation() {
            System.out.println("Bird Name: " + name + ", Age: " + age);
        }
    }
    static class Lion extends Mammal {
        public Lion(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " roars!");
        }

        @Override
        public void displayInformation() {
            System.out.println("Lion Name: " + name + ", Age: " + age);
        }
    }
    static class Elephant extends Mammal {
        public Elephant(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " trumpets!");
        }

        @Override
        public void displayInformation() {
            System.out.println("Elephant Name: " + name + ", Age: " + age);
        }
    }
    static class Parrot extends Bird {
        public Parrot(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " squawks and mimics!");
        }

        @Override
        public void displayInformation() {
            System.out.println("Parrot Name: " + name + ", Age: " + age);
        }
    }
    static class Eagle extends Bird {
        public Eagle(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " screeches!");
        }

        @Override
        public void displayInformation() {
            System.out.println("Eagle Name: " + name + ", Age: " + age);
        }
    }
    public static void main(String[] args) {
            // Create instances of various animals
            Animal lion = new Lion("Simba", 5);
            Animal elephant = new Elephant("Dumbo", 10);
            Animal parrot = new Parrot("Polly", 2);
            Animal eagle = new Eagle("Eddie", 4);

            // Test polymorphic behavior and method overriding
            Animal[] zoo = {lion, elephant, parrot, eagle};

            for (Animal animal : zoo) {
                animal.displayInformation();
                animal.eat();
                animal.makeSound();
                animal.sleep();
                System.out.println("-------------------");
            }
    }
}


