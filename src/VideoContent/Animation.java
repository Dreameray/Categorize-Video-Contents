/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoContent;

import HasA.DisneyPlus;

/**
 *
 * @author ErayAltay
 */
public class Animation  extends VideoContent {
    private static final double ANIMATIONPRICE = 10.0;
    private int productionYear;



    public Animation(String name, String publisher, String director, String genre, DisneyPlus dp, int productionYear) {
        super(name, publisher, director, genre, dp);
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "\n**Animation**" + super.toString() +
                "\nProduction Year: " + productionYear;
    }

    @Override
    public void calcPrice() {
        if (productionYear < 1990){
            setPrice(ANIMATIONPRICE * 1);
        }
        else if(productionYear<2000){
            setPrice(ANIMATIONPRICE * 2);
        }
        else if(productionYear<2010){
            setPrice(ANIMATIONPRICE * 3);
        }
        else{
            setPrice(ANIMATIONPRICE * 4.5);
        }
    }
    
}
