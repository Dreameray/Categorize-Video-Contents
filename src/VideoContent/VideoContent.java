/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoContent;

import HasA.DisneyPlus;
import java.io.Serializable;

/**
 *
 * @author ErayAltay
 */
public abstract class VideoContent implements Serializable{
    protected String name;
    protected String publisher;
    protected String director;
    protected String genre;
    protected double price;
    private static int countOfVC = 0;
    DisneyPlus dp;

    public VideoContent(String name, String publisher, String director, String genre, DisneyPlus dp) {
        this.name = name;
        this.publisher = publisher;
        this.director = director;
        this.genre = genre;
        countOfVC++;
        this.dp = dp;
    }

    public static int getCountOfVC() {
        return countOfVC;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public String toString() {
        return "\nName: " + name +
                "\nPublisher: " + publisher +
                "\nDirector: " + director +
                "\nGenre: " + genre + 
                "\nPrice of the Video Content: " + price +
                "\nContent will be watched on " + dp.getWheretoWatch() +
                "\nDisney Plus Subscription Service Price You Will Pay: " + (dp.getHowManyMonths() * dp.getPrice());
                
    }

    public boolean findName(String contentName) {
        return this.name.equalsIgnoreCase(contentName);
    }

    public abstract void calcPrice();
}
