package MeetUps;

import java.util.Scanner;

/****************************************
 Filename: 
 Created by: daire toner
 Created on: 
 Comment: 
 ***************************************/
public class Main
{
    private static int optionChosen()
    {
        //object of scanner class
        Scanner keyboard = new Scanner(System.in);

        //Print statements indicating to user their options and how to access them
        System.out.println("Input 1 -4 for the necessary functions or to exit any other number:");
        System.out.println("1. View all MeetUps");
        System.out.println("2. Create MeetUps");
        System.out.println("3. Update MeetUps");
        System.out.println("4. delete MeetUps");
        System.out.println("5. Help");

        //return the option chosen by the user
        return keyboard.nextInt();
    }//optionChosen

    public static void main(String[] args)
    {

        //creating instances of the CreateMeetUps and CurrentMeetUps classes
        CreateMeetUps createMeetUp = new CreateMeetUps();
        Meetup currentMeetUps = new Meetup();
        DeleteMeetUps deleteMeetUp = new DeleteMeetUps();
        UpdateMeetUps UpdateInformation = new UpdateMeetUps();


        //string populate date created, once it is placed into the addMeetUps method then it is stored me
        //allows string to be reused for the next meetUpdate
        String populateDate = createMeetUp.setDate(2023,12,30,16,0);
        createMeetUp.addMeetups("Coding","Ulster University Magee","Learning Java", populateDate);
        populateDate = createMeetUp.setDate(2024,3,9,12,30);
        createMeetUp.addMeetups("Arts","Ulster University Belfast","Learning to draw",populateDate);

        boolean continueProgram = true;
        String promptMeetingTitle = "Title: ";
        String promptMeetingLocation = "Location: ";
        String promptMeetingDescription = "Description: ";
        String promptSuccessfulCompletion = "Please take note of your unique ID";

        //switch statement invoking the correct function depending on the optionChosen function
        // this looped cannot be stopped. It is for testing purposes only
        while(continueProgram)
        {
            //Try catch to check if any incorrect input is done throughout the application
            //if any occurs then it bring them back to the home screen with a error message, application doesn't fully close
            try
            {
                switch (optionChosen())
                {
                    case 1:
                        currentMeetUps.PrintAllDetails();
                        //printing out all MeetUps/view all
                        break;
                    case 2:
                        createMeetUp.UserCreatedMeetUps(promptMeetingTitle, promptMeetingLocation, promptMeetingDescription, promptSuccessfulCompletion);
                        //creating and storing a MeetUp depending on user input
                        break;
                    case 3:
                        UpdateInformation.updateMeetupsInformation();
                        break;
                    case 4:
                        deleteMeetUp.deleteCurrentMeetups();
                        break;
                    case 5:
                        createMeetUp.helpOption();
                        break;
                    default:
                        continueProgram = false;
                        System.out.println("Thank You");
                        break;
                }//switch
            }//try
            catch (Exception e)
            {
                System.out.println("Incorrect input. Try Again.");
            }//catch
        }//while
    }//main
}//class
