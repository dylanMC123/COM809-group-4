package MeetUps;

/****************************************
 Filename: 
 Created by: Dylan Mc Canny 
 Created on: 
 Comment: 
 ***************************************/
public class UpdateMeetUps extends DeleteMeetUps
{
    public void updateMeetupsInformation()
    {
        CreateMeetUps updatedMeetUp= new CreateMeetUps();
        String updatedTitle = "PLease enter the updated Title";
        String updatedLocation = "PLease enter the updated location";
        String updatedDescription = "PLease enter the updated description";

        deleteCurrentMeetups();
        updatedMeetUp.UserCreatedMeetUps(updatedTitle,updatedLocation,updatedDescription);
    }
}