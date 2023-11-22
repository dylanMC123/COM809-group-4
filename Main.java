package MeetUps;

/****************************************
 Filename: 
 Created by: Dylan Mc Canny 
 Created on: 
 Comment: 
 ***************************************/
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        PopulateMeetUps createMeetUp = new PopulateMeetUps();
        createMeetUp.addMeetups("Coding","Ulster University Magee","Learning Java",2023,12,10,10,0, count);

        createMeetUp.addMeetups("Coding","Ulster University Magee","Learning Java",2023,12,10,10,0, count);


        Meetup newMeet = new Meetup();
        newMeet.printMeetUps();
    }
}
