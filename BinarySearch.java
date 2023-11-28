package MeetUps;

import java.util.ArrayList;

/****************************************
 Filename: 
 Created by: Dylan Mc Canny 
 Created on: 
 Comment: 
 ***************************************/
public class BinarySearch
{
    // get i want to check if userinput matches any ids with in the array
    //check if the current position in the arrays id == user input
    int binarySearch(ArrayList<Integer> binarySearchMeetUp, int userInput)
    {
        int startingPosition = 0;
        int arrayListLength = binarySearchMeetUp.size() + 1;

        while (startingPosition <= arrayListLength)
        {
            int mid = startingPosition + (arrayListLength - startingPosition) / 2;

            // Check if x is present at mid
            if (mid == userInput)
            {
                return binarySearchMeetUp.indexOf(mid);
            }

            // If x greater, ignore left half
            if (mid  < userInput) {
                startingPosition = mid + 1;
            }
                // If x is smaller, ignore right half
            else
            {
                arrayListLength = mid - 1;
            }
        }




        // if we reach here, then element was
        // not present
        return -1;
    }
}
