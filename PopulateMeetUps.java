package MeetUps;

/****************************************
 Filename: 
 Created by: Dylan Mc Canny 
 Created on: 
 Comment: 
 ***************************************/
public class PopulateMeetUps extends Meetup
{
    private void createNewMeetUp(String meetUpTitle, String meetUpLocation, String meetUpDescription,int meetUpId)
    {
        meetUpTitle = getMeetupTitle();
        meetUpLocation = getMeetupLocation();
        meetUpDescription = getMeetupDescription();
        meetUpId = getMeetupId();

        Meetup newMeetUp = new Meetup(meetUpTitle,meetUpLocation,meetUpDescription, meetUpId);
        storeMeetUps.add(newMeetUp);
    }

    protected void addMeetups(String title, String Location, String Description, int meetUpID)
    {
        setMeetupTitle(title);
        setMeetupLocation(Location);
        setMeetupDescription(Description);
        setMeetupId(meetUpID);

        createNewMeetUp(title, Location , Description, meetUpID);
    }



}
