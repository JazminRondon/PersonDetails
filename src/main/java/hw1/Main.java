package hw1;

public class Main {

    public static void main(String[] args) {
        Person person1=new Person("Jazmin", "Rondon");
        Person person2=new Person("Grey", "Lennox");
        Person person3=new Person("Mike", "Jones");

        Person[] arrayNames={person1,person2,person3};

        PersonHandler thePerson= new PersonHandler(arrayNames);

        System.out.println(thePerson.whileLoop());
        System.out.println(thePerson.forLoop());
        System.out.println(thePerson.forEachLoop());


    }
}
