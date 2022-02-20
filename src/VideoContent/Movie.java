/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoContent;

import HasA.DisneyPlus;
import Interface.OscarMovies;

/**
 *
 * @author ErayAltay
 */
public class Movie extends VideoContent implements OscarMovies {

    private static final double AWARDDISCOUNT = 0.05;
    private static final double NOMINEEDISCOUNT = 0.1;
    private static final double MOVIEPRICE = 20;
    private int runtime;
    private boolean isAwarded;
    private boolean isNominated;


    public Movie(String name, String publisher, String director, String genre, DisneyPlus dp, int runtime, boolean isAwarded, boolean isNominated) {
        super(name, publisher, director, genre, dp);
        this.runtime = runtime;
        this.isAwarded = isAwarded;
        this.isNominated = isNominated;
    }

    @Override
    public String toString() {
        return "\n**Movie**" + super.toString() +
                "\nRuntime: " + runtime +
                "\nAwarded Movie: " + isAwarded +
                "\nNominated Movie: " + isNominated;
    }

    @Override
    public void calcPrice() {
        setPrice(MOVIEPRICE * (runtime/60));
    }

    @Override
    public void calcDiscountPrice() {
        
        if(isNominated){
           
            setPrice(getPrice() - getPrice() * NOMINEEDISCOUNT);
        }
        else if(isAwarded){
            setPrice(getPrice() - getPrice() * AWARDDISCOUNT);
        }
    }
    
}
