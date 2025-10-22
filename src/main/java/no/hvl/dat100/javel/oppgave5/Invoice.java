package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices
        //er alltid 0 ifølge oppgaven
        this.amount = 0;
    }

    public void computeAmount() {
        double total = 0.0;
        double totalUsage = 0.0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                double used = usage[day][hour];
                double price = prices[day][hour];
                total += used * price;
                totalUsage += used;
            }
        }

        String agreement = c.getAgreement();
        switch (agreement.toUpperCase()) {
            case "POWERSUPPORT":
                total *= 0.9; // 10 % rabatt
                break;
            case "NORGESPRICE":
                total = totalUsage * 0.5; // fastpris
                break;
            case "SPOTPRICE":
            default:
                // ingen endring
                break;
    }
        
        this.amount = total;
    }

    public void printInvoice() {
        double totalUsage = 0.0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                totalUsage += usage[i][j];
            }
        }

        System.out.println("Customer number " + c.getCustomerNumber());
        System.out.println("Name  " + c.getName());
        System.out.println("Email " + c.getEmail());
        System.out.println("Agreement " + c.getAgreement());
        System.out.println();
        System.out.println("Month: " + month);
        System.out.printf("Usage: %10.2f kWh%n", totalUsage);
        System.out.printf("Amount: %10.2f NOK%n", amount);
    }
}
