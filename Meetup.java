package MeetUps;

import java.util.ArrayList;

/****
 ***** Created by dairetoner on 21/11/2023
 ***** Updated program description here
 ****/
public class Meetup
{
    //ArrayList to store MeetUp objects
    protected static ArrayList<Meetup> storeMeetUps = new ArrayList<Meetup>();

    // declaring Instance variables
    private String meetupTitle;
    private String meetupLocation;
    private  String meetupDescription;
    private int meetupId;

    //default constructor
   public Meetup()
   {

   }

  // overloaded constructor
    public Meetup(String title, String location, String description, int id)
    {
        meetupTitle = title;
        meetupLocation = location;
        meetupDescription = description;
        meetupId = id;
    }

    // getters and setter for meetUpId
    public  int getMeetupId() {
        return meetupId;
    }
    public  void setMeetupId(int meetupId) {
        this.meetupId = meetupId;
    }

    // getters and setter for meetUpTitle
    public String getMeetupTitle()
    {
        return meetupTitle;
    }
    public void setMeetupTitle(String title)
    {
        meetupTitle = title;
    }

    // getters and setter for meetUpLocation
    public String getMeetupLocation() {
        return meetupLocation;
    }
    public void setMeetupLocation(String location) {
        meetupLocation = location;
    }

    // getters and setter for meetDescription

    public String getMeetupDescription() {
        return meetupDescription;
    }
    public void setMeetupDescription(String description) {
        meetupDescription = description;
    }


    //method to print all details stored inside the ListArray
    protected void PrintAllDetails()
    {
        for(Meetup storedMeetUps: storeMeetUps)
        {
            //assigning new variables to get information through the object of storedMeetUp
            String Title = storedMeetUps.getMeetupTitle();
            String location = storedMeetUps.getMeetupLocation();
            String description = storedMeetUps.getMeetupDescription();

            //printing the information stored in storedMeetUp object
            System.out.println("Title: " + Title + "\t");
            System.out.println("Location: " + location +"\t");
            System.out.println("Description: " + description);
            System.out.println();
        }//foreach
    }//PrintAllDetails
}//class
