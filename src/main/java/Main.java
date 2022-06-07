public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Екатерина")
                .setSurname("Александрова")
                .setAge(25)
                .setCity("Москва")
                .build();

        Person daughter = mom.newChildBuilder()
                .setName("Эльза")
                .build();

        System.out.println("У " + mom + " есть сын, " + daughter);
    }
}
