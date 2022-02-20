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
public class Series extends VideoContent{
    private static double SERIESPRICE = 7.5;
    private int episodeNumber;
    private int oneEpisodeRuntime;


    public Series(String name, String publisher, String director, String genre, DisneyPlus dp, int episodeNumber, int oneEpisodeRuntime) {
        super(name, publisher, director, genre, dp);
        this.episodeNumber = episodeNumber;
        this.oneEpisodeRuntime = oneEpisodeRuntime;
    }

    @Override
    public String toString() {
        return "\n**Series**" + super.toString() +
                "\nEpisode Number: " + episodeNumber +
                "\nOne Episode Runtime: " + oneEpisodeRuntime;
    }

    @Override
    public void calcPrice() {
        setPrice(SERIESPRICE + (episodeNumber * oneEpisodeRuntime)/10 );
    }
    
}
