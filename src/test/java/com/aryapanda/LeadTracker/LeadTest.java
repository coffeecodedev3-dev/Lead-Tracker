package com.aryapanda.LeadTracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeadTest {



    @Test
    void aryaPandaShouldPass() throws DefaultException {
        Lead testLead = new Lead("Arya Panda","aryapanda@example.com",5000);
        assertEquals("Arya Panda",testLead.getName());
    }

    @Test
    void nullShouldFail() throws DefaultException {
        Lead t1 = new Lead("","arya.panda@example.com",50000);

    }

    @Test
    void numberNameShouldFail() throws DefaultException {
        Lead t2 = new Lead("123 User","User_123@example.com",60000);
        assertNotEquals("123 User",t2.getName());
    }

    @Test
    void characterNameShouldFail() throws DefaultException {
        Lead t3 = new Lead("A","A@example.com",700000);
    }

    @Test
    void emptySpaceShouldFail() throws DefaultException {
        Lead t3 = new Lead(" ","user_123@example.com",50000);
    }



//    

}