package com.aryapanda.LeadTracker;

public class Lead {
    private String name;
    private String email;
    private double dealValue;
    private String leadStatus = "NEW";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public double getDealValue(){
        return dealValue;
    }

    public void setDealValue(double dealValue) {
        this.dealValue = dealValue;
    }



    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }

    public String getLeadStatus() {
        return leadStatus;
    }


    public Lead(String leadName, String leadEmail, double dealValue) throws DefaultException {
        if(isValidName(leadName)){
            name = leadName;
        }else{
            throw new DefaultException("Invalid Name! Name should be least 2 character long");
        }

        if(isValidEmail(leadEmail)){
            email = leadEmail;
        }else{
            throw new DefaultException("Invalid email! Email should contain (@) symbol and ends with .com or .in extension");
        }

        if(isValidDealAmount(dealValue)){
            this.dealValue = dealValue;
        }else{
            throw new DefaultException("Invaild Deal Amount! amount could not be negative or zero");
        }
    }

    private boolean isValidDealAmount(double dealValue) {
        if (dealValue <= 0){
            return false;
        }

        return true;
    }

    private boolean isValidEmail(String leadEmail) {
        if(leadEmail.contains("@") && (leadEmail.endsWith(".com")||leadEmail.endsWith(".in"))){
            return true;
        }

        return false;
    }

    private boolean isValidName(String leadName) {
        if(leadName == null || leadName.trim().isEmpty() || leadName.chars().anyMatch(Character::isDigit)) {
            return false;
        }
        return true;
    }

    public String toString(){
        return String.format("Name:  %s" +
                        "\nEmail:   %s" +
                "\nDeal Value:  %f",name,email,dealValue
        );
    }

}
