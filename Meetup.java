package MeetUps;

import java.util.ArrayList;
import java.util.Calendar;

/****
 ***** Created by dairetoner on 21/11/2023
 ***** Updated program description here
 ****/
public class Meetup
{

    private Calendar newCalendar = Calendar.getInstance();
    public static ArrayList<Meetup> storeMeetUps = new ArrayList<Meetup>();
    private String meetupTitle;
    private String meetupLocation;
    private  String meetupDescription;
    private  int meetupId = 0;

   public Meetup()
   {

   }

    public Meetup(String title, String location, String description, Calendar date_Time, int id)
    {
        meetupTitle = title;
        meetupLocation = location;
        meetupDescription = description;
        newCalendar = date_Time;
        meetupId = id;
    }



    public Meetup(String title, String description)
    {
        meetupTitle = title;
        meetupDescription = description;
        meetupId++;
    }

    public  int getMeetupId() {
        return meetupId;
    }

    public  void setMeetupId(int meetupId) {
        meetupId = meetupId;
    }


    public  String getMeetupTitle()
    {
        return meetupTitle;
    }

    public String getMeetupLocation() {
        return meetupLocation;
    }

    public String getMeetupDescription() {
        return meetupDescription;
    }


    public void setMeetupTitle(String title)
    {
        meetupTitle = title;
    }

    public void setMeetupLocation(String location) {
        meetupLocation = location;
    }

    public void setMeetupDescription(String description) {
        meetupDescription = description;
    }

    public void setMeetupTime(Calendar Calendar) {
        newCalendar = Calendar;
    }
    public void PrintAllDetails() {
        System.out.println("The title is " + meetupTitle);
        System.out.println("The location is " + meetupLocation);
        System.out.println("The description is " + meetupDescription);
    }


    public void printMeetUps()
    {
        for (Meetup howMany: storeMeetUps)
        {
            System.out.println(meetupId);
        }
    }
}
