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
public class Documentary extends VideoContent {
    private static final double DOCUMENTARYPRICE = 15.0;
    private int runtime;

 

    public Documentary(String name, String publisher, String director, String genre, DisneyPlus dp, int runtime) {
        super(name, publisher, director, genre, dp);
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "\n**Documentary**" + super.toString() +
                "\nRuntime:" + runtime;
    }

    @Override
    public void calcPrice() {
        if(runtime > 120){
            setPrice(DOCUMENTARYPRICE + (runtime / 10));
        }
        else{
            setPrice(DOCUMENTARYPRICE + (runtime / 5));
        }
    }
}
