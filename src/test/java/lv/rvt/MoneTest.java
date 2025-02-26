package lv.rvt;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import org.junit.Test;

public class MoneTest{

    @Test
    public void testingPlusMethodTestCase1(){
        Money money1 = new Money(1, 65);
        Money money2 = new Money(1, 55);
        Money money3 = money1.plus(money2);

        assertTrue(money3.euros() == 3);

        assertTrue(money3.cents() == 20);
    }
    @Test
    public void testingPlusMethodTestCase2(){
        Money money1 = new Money(1, 50);
        Money money2 = new Money(0, 50);
        Money money3 = money1.plus(money2);

        assertTrue(money3.euros() == 2);

        assertTrue(money3.cents() == 0);
    }
    @Test
    public void testingLesserThanCase1(){
        Money money1 = new Money(1, 50);
        Money money2 = new Money(0, 50);

        assertTrue(money2.lessThan(money1));

        assertFalse(money1.lessThan(money2));
    }
}