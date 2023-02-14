import java.util.Scanner;

class Conversation {
  public static void main(String[] arguments) {

    // a list of our canned phrases
    String[] defaultResponse = {"cool!", "nice.", "okie dokie.", "that's interesting."};

    String[] transcript = {};

    Scanner roundInput = new Scanner(System.in);
    System.out.println("how many rounds? ");
    int userRounds = roundInput.nextInt();

    Scanner input = new Scanner(System.in);
    System.out.println("how's your day today, anything on your mind? ");
    String howDay = input.nextLine();


    for(int i = 0; i < userRounds; i++){
      if (howDay.contains("I") || howDay.contains("i")){
        System.out.println(howDay.replace("I", "You"));
      } else if (howDay.contains("me")) {
        System.out.println(howDay.replace("me", "you"));
      }else if (howDay.contains("am")) {
        System.out.println(howDay.replace("am", "are"));
      } else if (howDay.contains("your")) {
      System.out.println(howDay.replace("your", "my"));
      } else if (howDay.contains("you")) {
        System.out.println(howDay.replace("you", "I"));
      }else if (howDay.contains("my")) {
        System.out.println(howDay.replace("my", "your"));
      }
      else if (howDay.contains("are"))
        System.out.println(howDay.replace("are", "am"));
      else{
        int rand = (int) (Math.random()*(defaultResponse.length+1)) - 1; // maybe -1
        System.out.print(defaultResponse[rand]);
      }

      howDay = input.nextLine();
    }

    System.out.println("goodbye!");

    System.out.println("\ntranscript:\n" + transcript);

    input.close();
    roundInput.close();

  }



}