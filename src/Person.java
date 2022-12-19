public class Person {
    private String name;
    public boolean vaccinated;

    public Person(String name) {
        this.name = name;
        vaccinated = false;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }
}
