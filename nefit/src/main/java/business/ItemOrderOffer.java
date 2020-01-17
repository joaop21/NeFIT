/**
 * UserRoute
 * Authors: João Silva, Henrique, Tifany Silva, Miguel Solans
 * Notes:
 */

package business;

import javax.validation.constraints.NotNull;

public class ItemOrderOffer {
    @NotNull
    String manufacturerName;
    @NotNull
    String productName;
    @NotNull
    double quantity;
    @NotNull
    double unitPrice;

    public ItemOrderOffer(String manufacturerName, String productName, double quantity, double unitPrice) {
        this.manufacturerName = manufacturerName;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getManufacterName() {
        return this.manufacturerName;
    }

    public void setManufacterName(String manufacterName) {
        this.manufacturerName = manufacterName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
