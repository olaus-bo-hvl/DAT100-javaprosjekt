package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // Svar på deloppgave a:
        System.out.print("a) Lager en tabell med 4 lengde: ");
        Customers customer_list = new Customers(4);
        System.out.println();

        Customer c1 = new Customer("Alice Smith","alice@example.com",1001,PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson","bob@example.com",1002,PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose","charlie@example.com",1003,PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince","diana@example.com",1004,PowerAgreementType.NORGESPRICE);

        customer_list.addCustomer(c1);
        customer_list.addCustomer(c2);
        customer_list.addCustomer(c3);
        customer_list.addCustomer(c4);

        // Svar på deloppgave b:
        System.out.println("b) Listen har 4 plasser og antall opptatte plasser er: " + customer_list.countNonNull());
        System.out.println();

        // Svar på deloppgave c:
        System.out.println("Tester med getCustomer(1001):");
        System.out.println(customer_list.getCustomer(1001));
        System.out.println();

        // Svar på deloppgave e:
        System.out.println("Kunden som ble fjernet: \n" + customer_list.removeCustomer(1002));
        System.out.println();

        // Svar på deloppgave f:
        System.out.println("Ny liste:");
        Customer[] new_customer_list = customer_list.getCustomers();
        for (int i = 0; i < new_customer_list.length; i++){
            System.out.println(new_customer_list[i]);
            System.out.println();
        }
    }
}
