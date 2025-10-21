package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        // Tester svar på deloppgave a
        System.out.println("Strømforbruk per time i en måned:");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

        // Tester svar på deloppgave b
        System.out.println("Strømpris per time i en måned:");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

        // Tester svar på deloppgave c
        System.out.print("Total månedlig forbruk er: ");
        System.out.println(String.format("%.2f", MonthlyPower.computePowerUsage(power_usage_month)));
        System.out.println();

        // Tester svar på deloppgave d
        System.out.print("Overgår månedlig forbruk grensen for Norgespris: ");
        System.out.print(MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.println();
        System.out.println();

        // Tester svar på deloppgave e
        System.out.print("Totalpris for spotpris-bruker: ");
        System.out.print(String.format("%.2f", MonthlyPower.computeSpotPrice(power_usage_month,power_prices_month)));
        System.out.println();
        System.out.println();

        // Tester svar på deloppgave f
        System.out.print("Total strømstøtte er: ");
        System.out.print(String.format("%.2f", MonthlyPower.computePowerSupport(power_usage_month,power_prices_month)));
        System.out.println();
        System.out.println();

        // Tester svar på deloppgave f
        System.out.print("Total pris for kunde med Norgespris er: ");
        System.out.print(String.format("%.2f", MonthlyPower.computeNorgesPrice(power_usage_month)));
        System.out.println();
    }
}