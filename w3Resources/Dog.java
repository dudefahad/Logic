/* 2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.*/

public class Dog {

    private String name, breed;

    public Dog() {
    }


    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


public static void main(String[] args) {
    
        Dog obj1 = new Dog("dog1", "breed1");
        Dog obj2 = new Dog("dog2", "breed2");

        System.out.println(obj1.name +" "+ obj1.breed);
        System.out.println(obj2.name +" "+ obj2.breed);


        System.out.println("Values after updating : ");

        obj1.setName("sam");
        obj2.setName("curran");
        obj1.setBreed("local");
        obj2.setBreed("foreigm");


        System.out.println(obj1.name +" "+ obj1.breed);
        System.out.println(obj2.name +" "+ obj2.breed);

}
   

   
    

}
