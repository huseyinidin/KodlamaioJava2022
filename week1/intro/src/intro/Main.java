package intro;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World!");

        // variables - String - camelCase
        String middleText = "You might be interested.";
        String subText = "Expiry time";
        System.out.println(middleText);

        //integer
        int expiry = 12;

        double dollarWasYesterday = 18.14;
        double dollarToday = 18.20;

        boolean dollarPrice = false;
        
     // if-else
        String direction = "";

        if (dollarToday < dollarWasYesterday) {
        	direction = "down.svg";
            System.out.println(direction);
        } else if (dollarToday > dollarWasYesterday) {
        	direction = "up.svg";
            System.out.println(direction);
        } else {
        	direction = "equal.svg";
            System.out.println(direction);
        }
        
      // Array
        String[] credits = {"Fast Credit", "Salary from the Bank", "Happy Retired"};

        System.out.println(credits[0]);
        System.out.println(credits[1]);
        System.out.println(credits[2]);


        // for loop
        for (int i = 0; i < credits.length; i++) {
            System.out.println(credits[i]);
        }
	}
}
