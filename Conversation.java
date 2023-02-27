import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Conversation {
  public static void main(String[] arguments) {

  
    String[] defaultResponse = {"cool!", "nice.", "okie dokie.", "that's interesting."};

    ArrayList<String> transcript = new ArrayList<String>();


    Scanner roundInput = new Scanner(System.in);
    System.out.println("how many rounds? ");
    int userRounds = roundInput.nextInt();


    boolean changed = false;
    Scanner input = new Scanner(System.in);
    String compLine = "how's your day today, anything on your mind?";
    System.out.println(compLine);
    String howDay = input.nextLine();

    for(int i = 0; i < userRounds-1; i++){

      String[] howDayList = howDay.split(" ");
      // add to transcript
      transcript.add(compLine);
      transcript.add(howDay);

    
        for(int n = 0; n < howDayList.length-1; n++){
          if(howDayList[n].equals("i")){
            howDayList[n] = "you";
            changed = true;
          }else if(howDayList[n].equals("I")){
            howDayList[n] = "you";
            changed = true;
          }else if(howDayList[n].equals("me")){
            howDayList[n] = "you";
            changed = true;
          }else if(howDayList[n].equals("am")){
            howDayList[n] = "are";
            changed = true;
          }else if(howDayList[n].equals("you")){
            howDayList[n] = "I";
            changed = true;
          }else if(howDayList[n].equals("my")){
            howDayList[n] = "your";
            changed = true;
          }else if(howDayList[n].equals("your")){
            howDayList[n] = "my";
            changed = true;
          }
        }

        if(!changed){
          int rand = (int) (Math.random()*(defaultResponse.length));
          compLine = defaultResponse[rand];
        }else{
          compLine = String.join(" ", howDayList);
        }

        changed = false;

      System.out.println(compLine);

    
      howDay = input.nextLine();
    }

    transcript.add(compLine);
    transcript.add(howDay);
    System.out.println("goodbye!");
    transcript.add("goodbye!");

    System.out.println("\ntranscript:");
    for(String m: transcript){
      System.out.println(m);
    }

    input.close();
    roundInput.close();

  }



}