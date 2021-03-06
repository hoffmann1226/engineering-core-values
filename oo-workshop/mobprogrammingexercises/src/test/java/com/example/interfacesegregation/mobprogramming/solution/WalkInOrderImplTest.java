package com.example.interfacesegregation.mobprogramming.solution;

import org.junit.Test;;

import static org.junit.Assert.assertTrue;

public class WalkInOrderImplTest {
    @Test
    public void walkInCustomerOrder() {
        //arrange
        WalkInOrderImpl given = new WalkInOrderImpl("Roger Miller", "Cheese Sandwich");

        //act
        String when = given.walkInCustomerOrder();

        //assert
        assertTrue(when.contains("Roger Miller"));
        assertTrue(when.contains("Cheese Sandwich"));
    }
}
