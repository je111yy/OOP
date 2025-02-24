class Dog {
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printDetails() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Princess", "Bulldog");
        Dog dog2 = new Dog("Prince", "Golden Retriever");

        dog1.printDetails();
        dog2.printDetails();

        dog1.setName("Rocky");
        dog1.setBreed("Labrador");
        dog2.setName("Charlie");
        dog2.setBreed("Beagle");

        System.out.println("\nUpdated Details:");
        dog1.printDetails();
        dog2.printDetails();
    }
}
