package com.inducesmile.androidgsonparser;

import com.google.gson.annotations.SerializedName;

public class ItemObject {

    @SerializedName("gym_id")
    private String gymIdentification;
    @SerializedName("name")
    private String gymName;
    @SerializedName("version")
    private String gymVersion;

    @SerializedName("schedules")
    private String gymSchedules;
    @SerializedName("week")
    private String gymWeek;
    @SerializedName("weekday")
    private String gymWeekday;

    @SerializedName("pauses")
    private String gymPauses;
    @SerializedName("auto_start_count")
    private String gymAutostartcount;
    @SerializedName("failed_session_count")
    private String gymFailedsessioncount;

    @SerializedName("number_of_days_modified_in_seven_days")
    private String gymNumberofdays;
    @SerializedName("started_this_month_count")
    private String gymStartedthismonth;
    @SerializedName("last_online")
    private String gymLastonline;

    @SerializedName("ios_version")
    private String gymIosVersion;
    @SerializedName("device")
    private String gymdevice;

    public ItemObject(String gymIdentification, String gymName, String gymVersion, String gymSchedules, String gymWeek, String gymWeekday, String gymPauses, String gymAutostartcount, String gymFailedsessioncount, String gymNumberofdays, String gymStartedthismonth, String gymLastonline, String gymIosVersion, String gymdevice) {
        this.gymIdentification = gymIdentification;
        this.gymName = gymName;
        this.gymVersion = gymVersion;
        this.gymSchedules = gymSchedules;
        this.gymWeek = gymWeek;
        this.gymWeekday = gymWeekday;
        this.gymPauses = gymPauses;
        this.gymAutostartcount = gymAutostartcount;
        this.gymFailedsessioncount = gymFailedsessioncount;
        this.gymNumberofdays = gymNumberofdays;
        this.gymStartedthismonth = gymStartedthismonth;
        this.gymLastonline = gymLastonline;
        this.gymIosVersion = gymIosVersion;
        this.gymdevice = gymdevice;
    }

    public String getGymIdentification() {
        return gymIdentification;
    }

    public String getGymName() {
        return gymName;
    }

    public String getGymVersion() {
        return gymVersion;
    }

    public String getGymSchedules() {
        return gymSchedules;
    }

    public String getGymWeek() {
        return gymWeek;
    }

    public String getGymWeekday() {
        return gymWeekday;
    }

    public String getGymPauses() {
        return gymPauses;
    }

    public String getGymAutostartcount() {
        return gymAutostartcount;
    }

    public String getGymFailedsessioncount() {
        return gymFailedsessioncount;
    }

    public String getGymNumberofdays() {
        return gymNumberofdays;
    }

    public String getGymStartedthismonth() {
        return gymStartedthismonth;
    }

    public String getGymLastonline() {
        return gymLastonline;
    }

    public String getGymIosVersion() {
        return gymIosVersion;
    }

    public String getGymdevice() {
        return gymdevice;
    }


/*   public ItemObject(String ownerIdentification, String ownerName, String ownerFullname) {
        this.ownerIdentification = ownerIdentification;
        this.ownerName = ownerName;
        this.ownerFullname = ownerFullname;
    }

    public String getOwnerIdentification() {
        return ownerIdentification;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerFullname() {
        return ownerFullname;
    }*/
}
