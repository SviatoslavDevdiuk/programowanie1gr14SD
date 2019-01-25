package invoice.model;

import invoice.watch.Watch;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.DoubleAdder;

public class Invoice {
    private String invoiceNumber;
    private Client client;
    private List<Watch> productList;
    private double sumPrice;
    private static int invoiceID;

    public Invoice(Client client, List<Watch> productList) {
        this.invoiceNumber = generateInvoiceNumber();
        this.client = client;
        this.productList = productList;
        this.sumPrice = pricesAddition(productList);
    }

    public String getCurrentDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(date);
    }

    public int generateInvoiceID() {
        invoiceID++;
        return invoiceID;
    }

    public String generateInvoiceNumber() {
        return generateInvoiceID() + getCurrentDate();

    }

    public double pricesAddition(List<Watch> list) {
        DoubleAdder d = new DoubleAdder();
        list.stream().map(x -> x.getPrice()).forEach(d::add);
        this.sumPrice = d.doubleValue();
        return d.doubleValue();
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

//    public LocalDate getCreationDate() {
//        return creationDate;
//    }
//
//    public void setCreationDate(LocalDate creationDate) {
//        this.creationDate = creationDate;
//    }

    public List<Watch> getProductList() {
        return productList;
    }

    public void setProductList(List<Watch> productList) {
        this.productList = productList;
        productList.forEach(x -> sumPrice += x.getPrice());
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + "\n" +
                ", client=" + client + "\n" +
//                ", creationDate=" + creationDate + "\n" +
                ", productList=" + productList + "\n" +
                ", sumPrice=" + sumPrice +
                '}';
    }
}
