
public class  DuplicateWordFinder {

    private static String[] words;

// hasDuplicates method for find if there is any duplicate or no
    public static boolean hasDuplicates(String [] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
	// write your code here
        String[] words = {"spring", "summer", "fall","summer", "winter"};
        int n = words.length;


        // Print the String[] words list
        for (int i = 0; i < n; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

//print false if there is any duplicates and print true if there isnt using hasDuplicates method.
        System.out.println("is there any duplicates :"+ hasDuplicates(words));
    }
}



