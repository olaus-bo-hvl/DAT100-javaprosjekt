package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer a = new Customer("Ola Nordmann", "ola.nordmann@mail.com",1,PowerAgreementType.NORGESPRICE);

        // Tester getter-metodene
        System.out.println("Name: " + a.getName());
        System.out.println("Email: " + a.getEmail());
        System.out.println("Customer number: " + a.getCustomer_id());
        System.out.println("Agreement: " + a.getAgreement());
        System.out.println();

        // Tester Setter-metodene
        a.setName("Per Spelmann");
        a.setEmail("per.spelmann@mail.com");
        a.setCustomer_id(2);
        a.setAgreement(PowerAgreementType.SPOTPRICE);

        // Tester endringene av customer_a
        System.out.println("Etter endringene:");
        System.out.println(a);
    }
}
