package attributes.person;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("John Doe","631731ZA");
        System.out.println(person.personToString());
        person.correctData("Jack Doe","631731QA");
        System.out.println(person.personToString());
        person.moveTo(new Address("Hungary","Budapest","Bajza utca 44","1025"));
        System.out.println(person.getAddress().adressToString());
    }
}
