package shared;

import android.location.Location;

import java.io.Serializable;
import java.util.Date;

public class Meeting {
    private Date meetingDate;
    private String otherGuy;
    private Location meetingLocation;
    private static int count = 0;
    // add contract/whatever field
    // add photo
    public Meeting(String otherGuy, Location meetingLocation) {
        this.otherGuy = otherGuy;
        this.meetingLocation = meetingLocation;
        this.meetingDate = new Date();
    }
    //for debugging
    public Meeting() {
        this.meetingLocation = null;
        this.meetingDate = new Date();
        this.count++;
        this.otherGuy = this.count+"";
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getOtherGuy() {
        return otherGuy;
    }

    public void setOtherGuy(String otherGuy) {
        this.otherGuy = otherGuy;
    }

    public Location getMeetingLocation() {
        return meetingLocation;
    }

    public void setMeetingLocation(Location meetingLocation) {
        this.meetingLocation = meetingLocation;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Meeting.count = count;
    }
}
