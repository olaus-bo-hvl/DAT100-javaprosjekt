package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;
        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // a) Test utskrift av strømpriser
        System.out.println("Strømpriser per time:");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        // b) Test utskrift av strømforbruk
        System.out.println("Strømforbruk per time:");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        // c) Test totalforbruk
        double totalUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.printf("Totalt strømforbruk for dagen: %.2f kWh%n", totalUsage);

        // d) Test spotpris
        double totalSpotPrice = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("Total spotpris: %.2f NOK%n", totalSpotPrice);

        // f) Test strømstøtte
        double totalSupport = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.printf("Total strømstøtte: %.2f NOK%n", totalSupport);

        // g) Test Norgespris
        double norgesPris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.printf("Total Norgespris: %.2f NOK%n", norgesPris);

        // h) Test høyeste timeforbruk
        double maxUsage = DailyPower.findPeakUsage(powerusage_day);
        System.out.printf("Største timeforbruk: %.2f kWh%n", maxUsage);

        // i) Test gjennomsnittlig forbruk
        double avgUsage = DailyPower.findAvgPower(powerusage_day);
        System.out.printf("Gjennomsnittlig timeforbruk: %.2f kWh%n", avgUsage);
    }
}