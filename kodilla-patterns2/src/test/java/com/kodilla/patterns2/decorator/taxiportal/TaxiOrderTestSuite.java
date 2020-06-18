package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        BigDecimal cost = order.getCost();
        assertEquals(new BigDecimal(5), cost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        String description = order.getDescription();
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        BigDecimal cost = order.getCost();
        assertEquals(new BigDecimal(40), cost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        String description = order.getDescription();
        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new MyTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        BigDecimal cost = order.getCost();
        assertEquals(new BigDecimal(37), cost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new MyTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        String description = order.getDescription();
        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new VipDecorator(order);
        order = new ChildSeatDecorator(order);
        BigDecimal cost = order.getCost();
        assertEquals(new BigDecimal(52), cost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new VipDecorator(order);
        order = new ChildSeatDecorator(order);
        String description = order.getDescription();
        assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }
}
