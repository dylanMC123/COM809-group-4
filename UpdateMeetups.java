package MeetUps;

/****************************************
 Filename: 
 Created by: Dylan Mc Canny 
 Created on: 
 Comment: 
 ***************************************/
public class UpdateMeetups extends DeleteMeetups
{
    public void updateMeetupsInformation()
    {




            //instance of createMeetUps class
            CreateMeetups updatedMeetUp = new CreateMeetups();

            //Strings to update the print statements in the userCreatedMeetUps function
            String updatedTitle = "PLease enter the updated Title";
            String updatedLocation = "PLease enter the updated location";
            String updatedDescription = "PLease enter the updated description";
            String updatedIDMessage = "Your update was successful!\nYour new unique ID is: ";
            String updatedIdMessage = "Your ID has been updated";


            //resetting the boolean to false before executing the deleteCurrentMeetups methods
            userInputMatchesId = false;
            //calling delete meetups method
            deleteCurrentMeetups(updatedIdMessage);

            //if the id matches then it allows user to update that entry
            if (userInputMatchesId)
            {
                updatedMeetUp.userCreatedMeetUps(updatedTitle, updatedLocation, updatedDescription, updatedIDMessage);
            }//if
    }//updateMeetupsInformation
}//class

