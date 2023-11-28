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
        String updatedIDMessage = "Your update was successful!\nYour new unique ID is: ";


        userInputMatchesId = false;
        deleteCurrentMeetups();

        if(userInputMatchesId)
        {
            updatedMeetUp.UserCreatedMeetUps(updatedTitle, updatedLocation, updatedDescription, updatedIDMessage);
        }
    }
}
