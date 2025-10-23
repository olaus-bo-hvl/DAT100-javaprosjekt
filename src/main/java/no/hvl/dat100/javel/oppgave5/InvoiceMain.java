package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer c1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);

        // Simulert bruk og priser (2 dager, 3 timer per dag)
        double[][] usage = {
                {1.0, 1.5, 2.0},
                {0.5, 1.0, 1.5}
        };

        double[][] prices = {
                {1.0, 1.0, 1.0},
                {1.0, 1.0, 1.0}
        };

        // Faktura for hver avtaletype
        Invoice i1 = new Invoice(c1, "January", usage, prices);
        Invoice i2 = new Invoice(c2, "January", usage, prices);
        Invoice i3 = new Invoice(c3, "January", usage, prices);

        // Beregn og skriv ut
        i1.computeAmount();
        i2.computeAmount();
        i3.computeAmount();

        System.out.println("=== Faktura for SPOTPRICE ===");
        i1.printInvoice();

        System.out.println("\n=== Faktura for NORGESPRICE ===");
        i2.printInvoice();

        System.out.println("\n=== Faktura for POWERSUPPORT ===");
        i3.printInvoice();

    }
}
