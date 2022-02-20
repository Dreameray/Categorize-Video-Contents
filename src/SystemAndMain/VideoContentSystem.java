/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAndMain;

import Comparator.VideoContentComparator;
import HasA.DisneyPlus;
import VideoContent.Animation;
import VideoContent.Documentary;
import VideoContent.Movie;
import VideoContent.Series;
import VideoContent.ShortFilm;
import VideoContent.VideoContent;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author ErayAltay
 */
public class VideoContentSystem {

    private static HashSet<VideoContent> videoContentSet = new HashSet();
    private static TreeSet<VideoContent> videoContentSortedSet;

    public static HashSet<VideoContent> getVideoContentSet() {
        return videoContentSet;
    }


    public static boolean checkVideoContentName(String vCName) {
       for(VideoContent v: videoContentSet ){
           if(v.findName(vCName))
               return true;
       }
       return false;
    }

    public static boolean addVideoContent(String name, String publisher, String director, String genre, DisneyPlus dp, int runtimeMovie, boolean isAwarded, boolean isNominated, int productionYear, int runtimeDoc, int episodeNumber, int oneEpisodeRuntime, String rating) {

        Animation an;
        Documentary dc;
        Movie mv;
        Series se;
        ShortFilm sf;

        if (checkVideoContentName(name)) { // it already exist
            return false;
       } else {
                if (genre.equalsIgnoreCase("Animation")) {
                    an = new Animation(name, publisher, director, genre, dp, productionYear );
                    videoContentSet.add(an);
                } else if (genre.equalsIgnoreCase("Documentary")) {
                    dc = new Documentary(name, publisher, director, genre, dp, runtimeDoc);
                    videoContentSet.add(dc);
                } else if (genre.equalsIgnoreCase("Movie")) {
                    mv = new Movie(name, publisher, director, genre, dp, runtimeMovie, isAwarded, isNominated);
                    videoContentSet.add(mv);
                } else if (genre.equalsIgnoreCase("Series")) {
                    se = new Series(name, publisher, director, genre, dp, episodeNumber, oneEpisodeRuntime);
                    videoContentSet.add(se);
                } else if (genre.equalsIgnoreCase("Short Film")) {
                    sf = new ShortFilm(name, publisher, director, genre, dp, rating);
                    videoContentSet.add(sf);
                }
                
                return true;
            }
        
    }
    
   public static String[] getVideoContentName() {
        String vC[] = new String[videoContentSet.size()];
        int i=0;
        for(VideoContent v: videoContentSet){
            vC[i] = v.getName();
            i++;
        }
        return vC;
    }

    public static VideoContent removeVideoContent(String videoContentRemove) {
        for(VideoContent v: videoContentSet){
            if(v.findName(videoContentRemove)){
                videoContentSet.remove(v);
                return v;
            }
                
        }
        return null;
    }

    public static VideoContent searchVideoContent(String videoContentSearch) {
        for(VideoContent v: videoContentSet){
            if(v.findName(videoContentSearch))
                
                return v;
           
                
        }
        return null;
    }

    public static String display() {
      VideoContentComparator vcc = new VideoContentComparator();
      videoContentSortedSet = new TreeSet<>(vcc);
      videoContentSortedSet.addAll(videoContentSet);     
      String res = "";
      for (VideoContent v : videoContentSortedSet) {
          res += v.toString() + "\n";
      }
      res += "Count of Video Content: ";
      res += VideoContent.getCountOfVC();

         return res;  
    }

    public static void calcNewPrice() {

        for (VideoContent v : videoContentSet) {
            v.calcPrice();
            if (v instanceof Movie) {
                ((Movie) v).calcDiscountPrice();
            }
        }
    }
}
