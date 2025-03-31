import java.util.Arrays;

class StringOperations {
    
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        
        if (arr1.length != arr2.length) return false;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }

    
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    
    
    public static int[] countVowelsAndConsonants(String sentence) {
        int vowels = 0, consonants = 0;
        sentence = sentence.toLowerCase().replaceAll("[^a-z]", "");
        
        for (char c : sentence.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String sentence = "Practice makes a man perfect";
        
        // Checking for anagrams
        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + isAnagram);
        
        // Finding the longest word
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);
        
        // Counting vowels and consonants
        int[] counts = countVowelsAndConsonants(sentence);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
    }
}
