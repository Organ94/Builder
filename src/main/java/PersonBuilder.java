public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Не хватает обязательных данных!");
        }
        Person person = new Person(name, surname, age);
        person.setCity(city);

        return person;
    }
}
