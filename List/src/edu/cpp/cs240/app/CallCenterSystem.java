package edu.cpp.cs240.app;

import edu.cpp.cs240.IntArrayList;
import edu.cpp.cs240.IntSLinkedList;
import edu.cpp.cs240.IntList;

public class CallCenterSystem {

    IntList customerList = new IntArrayList();
//    IntList customerList = new IntSLinkedList();

    public void putCustomerRequest(int customerId) {
        customerList.add(customerId);
        System.out.println("Customrer " + customerId + " has been added in the list");
        System.out.println("Total cutsomers waiting: " + customerList.size());
    }

    public int getNextCustomer() {
        if (customerList.size() == 0) {
            return -1;
        }
        int customerId = customerList.get(0);
        customerList.remove(0);
        System.out.println("Customer " + customerId + " has been served.");
        System.out.println("Total cutsomers waiting: " + customerList.size());
        return customerId;
    }
}
