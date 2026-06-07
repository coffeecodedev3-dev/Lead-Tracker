package com.aryapanda.LeadTracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeadTrackerRunnerTest {
    @Test
    void aryaPandaShouldPass() throws DefaultException {
        Lead testLead = new Lead("Arya Panda","aryapanda@example.com",5000);
        assertEquals("Arya Panda",testLead.getName());
    }
}