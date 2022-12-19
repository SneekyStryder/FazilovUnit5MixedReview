public class Clinic {
    private static int totalVaccineCount;
    private int vaccineCount;

    public void vaccinate(Person person) {
        person.vaccinated = true;
        vaccineCount++;
        totalVaccineCount++;
    }

    public int getVaccineCount() {
        return vaccineCount;
    }

    public static int getTotalVaccineCount() {
        return totalVaccineCount;
    }
}
