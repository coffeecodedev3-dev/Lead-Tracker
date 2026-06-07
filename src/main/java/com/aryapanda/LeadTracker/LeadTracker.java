package com.aryapanda.LeadTracker;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LeadTracker {
    Scanner sc = new Scanner(System.in);

    ArrayList<Lead> leads = new ArrayList<Lead>();

    private int operation = 0;

    public void printWelcomeMessage(){
        while(operation !=5){
            System.out.println("// Welcome to Lead Tracker //" + "\n   System is online now ");
            System.out.println("Select your Operation " + "\n1. Lead Registration" + "\n2. Status Tracking" + "\n3. Revenue Analytics" + "\n4. Update Status" + "\n5. Exit");

            operation = sc.nextInt();
            sc.nextLine();

            performAction();
        }


    }

    public void performAction(){
        switch(operation){
            case 1:
                RegisterLead();
                break;
            case 2:
                TrackStatus();
                break;
            case 3:
                AnalyseRevenue();
                break;
            case 4:
                ChangeLeadStatus();
                break;
            case 5:
                System.out.println("System is offline now");
                break;
            default: System.out.println("Invalid Operation! \nPlease select the correct operation");
        }
    }
    
    


    private double AnalyseRevenue() {
        double Revenue = leads.stream().filter(e -> e.getLeadStatus().equals("WON")).map(e -> e.getDealValue()).reduce(0.0,(currentTotal,nextValue) -> currentTotal+nextValue);

        System.out.println(Revenue);
        return Revenue;
    }

    private void TrackStatus() {
        System.out.println("Please Select the action you want to perform" + "\n1. Track all Won Leads" + "\n2. Track all Lost Leads" + "\n3. Track all new Leads" + "\n4. Track all contacked Leads");

        int action = sc.nextInt();
         switch(action){
             case 1:
                 System.out.println(trackWon());
                 break;
             case 2:
                 System.out.println(trackLost());
                 break;
             case 3:
                 System.out.println(trackNew());
                 break;
             case 4:
                 System.out.println(trackContacted());
                 break;
             default :
                 System.out.println("Invalid action");
         }
    }

    //    Methods for Tracking Leads
    private String trackContacted() {
        return leads.stream().filter(e -> e.getLeadStatus().equalsIgnoreCase("CONTACTED")).collect(Collectors.toList()).toString();
    }

    private String trackNew() {
        return leads.stream().filter(e -> e.getLeadStatus().equalsIgnoreCase("NEW")).collect(Collectors.toList()).toString();
    }

    private String trackLost() {
        return leads.stream().filter(e -> e.getLeadStatus().equalsIgnoreCase("LOST")).collect(Collectors.toList()).toString();
    }

    private String trackWon() {
        return leads.stream().filter(e -> e.getLeadStatus().equalsIgnoreCase(
                "WON")).collect(Collectors.toList()).toString();
    }


//    Method for updating Lead Status
    private void ChangeLeadStatus() {
        System.out.println("Enter email of the lead to change status");
        String email = sc.nextLine();
        System.out.println("Select the status" + "\nNEW" + "\nContacted" + "\nWon" + "\nLost");
        String choice = sc.nextLine();



        for(Lead lead:leads){
            if(lead.getEmail().equalsIgnoreCase(email)){
                lead.setLeadStatus(choice);
            }
        }
    }


//    Register New Lead
    private void RegisterLead() {
        System.out.println("Enter Lead Name");
        String leadName = sc.nextLine();

        System.out.println("Enter Lead email");
        String leadEmail = sc.nextLine();

        System.out.println("Enter expected deal value");
        double dealValue = sc.nextInt();
        sc.nextLine();

        try {
            Lead lead = new Lead(leadName,leadEmail,dealValue);
            leads.add(lead);
            System.out.println("new Lead is created");
            System.out.println(lead.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }

}
