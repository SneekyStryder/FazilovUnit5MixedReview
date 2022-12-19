public class ClinicRunner {
    public static void main(String[] args) {
        Clinic queens = new Clinic();
        Clinic bronx = new Clinic();
        Person mary = new Person("Mary");
        Person bob = new Person("Bob");
        Person charles = new Person("Charles");
        Person julie = new Person("Julie");
        Person chris = new Person("Chris");
        Person bill = new Person("Bill");

        queens.vaccinate(mary);
        queens.vaccinate(bob);
        bronx.vaccinate(charles);
        bronx.vaccinate(julie);
        queens.vaccinate(chris);

        System.out.println(queens.getVaccineCount()); // should print 3
        System.out.println(bronx.getVaccineCount()); // should print 2
        System.out.println(Clinic.getTotalVaccineCount()); // should print 5

        System.out.println(charles.isVaccinated()); // should print true
        System.out.println(bill.isVaccinated()); // should print false

    }
}
