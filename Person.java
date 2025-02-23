class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Lance", 21, "Antipolo");
        Person person2 = new Person("Josh", 20, "Cebu");
        Person person3 = new Person("Kurt", 22, "Pasig");
        Person person4 = new Person("Ralf", 19, "Taytay Rizal");
        Person person5 = new Person("Reese", 34, "Quezon City");

        person1.printDetails();
        person2.printDetails();
        person3.printDetails();
        person4.printDetails();
        person5.printDetails();
    }
}
