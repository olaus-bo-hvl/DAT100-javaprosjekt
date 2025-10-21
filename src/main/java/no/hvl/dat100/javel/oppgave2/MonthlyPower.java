package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int j = 0; j < usage.length; j++) {
            int day = j+1;
            System.out.print("Day "+ day + ": ");
            for (int i = 0; i < usage[j].length; i++) {

                System.out.printf("%.2f kWh ", usage[j][i]);
            }
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int j = 0; j < prices.length; j++) {
            int day = j+1;
            System.out.print("Day "+ day + ": ");
            for (int i = 0; i < prices[j].length; i++) {

                System.out.printf("%.2f NOK ", prices[j][i]);
            }
            System.out.println();
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int j =0; j <usage.length; j++) {
            for (int i = 0; i < usage[j].length; i++) {

                sum += usage[j][i];
            }
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int i = 0;

        while (i < powerusage.length && usage <= threshold){
            for (int j = 0; j < powerusage[i].length && usage <= threshold; j++){
                usage += powerusage[i][j];
            }
            i++;
        }
        if (usage >= threshold) {
            exceeded = true;
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++){
            for (int j = 0; j < usage[i].length; j++) {
                price += usage[i][j] * prices[i][j];
            }
        }

        return price;
    }

    // f) power support for the month
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double price = 0;

        for (int i = 0; i < usage.length; i++){
            for (int j = 0; j < usage[i].length; j++) {
                price = usage[i][j] * prices[i][j];
                if (price > THRESHOLD) {
                    support += (price - THRESHOLD) * PERCENTAGE;
                }
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    private static final double NORGESPRIS = 0.5;
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (int i = 0; i< usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++){
                price += usage[i][j] * NORGESPRIS;
            }
        }

        return price;
    }
}
