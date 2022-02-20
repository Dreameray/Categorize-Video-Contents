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
public class ShortFilm extends VideoContent{
    private static final double SHORTFILMPRICE = 2.5;
    private String rating;

    public ShortFilm(String name, String publisher, String director, String genre, DisneyPlus dp, String rating) {
        super(name, publisher, director, genre, dp);
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "\n**ShortFilm**" +
                super.toString() +
                "\nRating: " + rating;
    }

    @Override
    public void calcPrice() {
        if(rating.equalsIgnoreCase("M")){
            setPrice(SHORTFILMPRICE * 10);
        }
        else if(rating.equalsIgnoreCase("T")){
            setPrice(SHORTFILMPRICE * 5);
        }
        else{
            setPrice(SHORTFILMPRICE * 2);
        }
    }
    
}
