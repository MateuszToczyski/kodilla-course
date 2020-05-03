package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {

        Product product = new Product("iPhone 11");

        Item item1 = new Item(product, BigDecimal.valueOf(3000), 10, BigDecimal.valueOf(30000));
        Item item2 = new Item(product, BigDecimal.valueOf(2900), 100, BigDecimal.valueOf(290000));

        Invoice invoice = new Invoice("XYZ12345");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoiceDao.save(invoice);

        Optional<Invoice> invoiceResult = invoiceDao.findById(invoice.getId());
        Assert.assertEquals(invoice.getItems().size(), invoiceResult.get().getItems().size());

        invoiceDao.deleteById(invoice.getId());
        productDao.deleteById(product.getId());
    }
}
