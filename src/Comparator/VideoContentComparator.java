/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import VideoContent.VideoContent;
import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author ErayAltay
 */
public class VideoContentComparator implements Comparator<VideoContent>, Serializable {

    @Override
    public int compare(VideoContent t, VideoContent t1) {
        return t.getName().compareTo(t1.getName());
    }
     
}
