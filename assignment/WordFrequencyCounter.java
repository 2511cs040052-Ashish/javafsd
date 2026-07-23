import java.util.HashMap;
import java.util.Scanner;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        // Split sentence into words
        String[] words = sentence.toLowerCase().split(" ");
        // Create HashMap
        HashMap<String, Integer> frequency = new HashMap<>();
        // Count word frequency
        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }
        // Display frequencies
        System.out.println("\nWord Frequencies:");
        for (String word : frequency.keySet()) {
            System.out.println(word + " : " + frequency.get(word));
        }
        sc.close();
    }
}