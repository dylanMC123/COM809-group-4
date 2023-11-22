package MeetUps;

import java.util.ArrayList;

/****
 ***** Created by dairetoner on 21/11/2023
 ***** Updated program description here
 ****/
public class Meetup
{
    public static ArrayList<Meetup> storeMeetUps = new ArrayList<Meetup>();
    private String meetupTitle;
    private String meetupLocation;
    private  String meetupDescription;
    private  int meetupId = 0;

   public Meetup()
   {

   }

    public Meetup(String title, String location, String description, int id)
    {
        meetupTitle = title;
        meetupLocation = location;
        meetupDescription = description;
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

    protected void PrintAllDetails()
    {
        for(Meetup storeMeeting: storeMeetUps)
        {
            String Title = storeMeeting.getMeetupTitle();
            String location = storeMeeting.getMeetupLocation();
            String description = storeMeeting.getMeetupDescription();

            System.out.println("Title: " + Title + "\t");
            System.out.println("Location: " + location +"\t");
            System.out.println("Description: " + description);
            System.out.println();
        }//foreach
    }
}//class
