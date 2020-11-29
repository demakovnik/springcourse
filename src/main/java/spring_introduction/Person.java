package spring_introduction;

public class Person {

    private String surname;
    private int age;

    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
