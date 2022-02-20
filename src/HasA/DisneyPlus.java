/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HasA;

/**
 *
 * @author ErayAltay
 */
public class DisneyPlus {
    private String wheretoWatch;
    private double price;
    private int howManyMonths;

    public DisneyPlus() {
        this.wheretoWatch = "";
        this.price = 0.0;
        this.howManyMonths = 0;
    }

    public DisneyPlus(String wheretoWatch, double price, int howManyMonths) {
        this.wheretoWatch = wheretoWatch;
        this.price = price;
        this.howManyMonths = howManyMonths;
    }

    public String getWheretoWatch() {
        return wheretoWatch;
    }

    public double getPrice() {
        return price;
    }

    public int getHowManyMonths() {
        return howManyMonths;
    }

}
