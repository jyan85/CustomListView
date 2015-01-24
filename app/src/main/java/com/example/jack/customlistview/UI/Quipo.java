package com.example.jack.customlistview.UI;

/**
 * Created by Jack on 2015-01-22.
 */
public class Quipo {
    private int userIconID;
    private int videoThumbIconID;
    private String videoName;
    private String videoDetail;
    private String senderName;

    public Quipo(int userIconID, int videoThumbIconID, String videoName, String videoDetail, String senderName) {
        super();
        this.userIconID = userIconID;
        this.videoThumbIconID = videoThumbIconID;
        this.videoName = videoName;
        this.videoDetail = videoDetail;
        this.senderName = senderName;
    }

    public String getVideoName() {
        return videoName;
    }

    public String getVideoDetail() {
        return videoDetail;
    }

    public String getSenderName() {
        return senderName;
    }

    public int getUserIconID() {
        return userIconID;
    }

    public int getVideoThumbIconID() {
        return videoThumbIconID;
    }
}
