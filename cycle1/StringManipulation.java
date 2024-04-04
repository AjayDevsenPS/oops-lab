import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter another string for comparison: ");
        String comparisonString = scanner.nextLine();
        System.out.print("Enter a character to check its presence: ");
        char targetChar = scanner.next().charAt(0);
        System.out.print("Enter a suffix to check if it's at the end of the first string: ");
        String suffix = scanner.next();
        scanner.close();

        StringManipulation obj = new StringManipulation();

        obj.capitalizeFirstLetter(inputString);
        obj.isPalindrome(inputString);
        obj.countCharacters(inputString);
        obj.deleteConsonants(inputString);
        obj.isCharacterPresent(inputString, targetChar);
        obj.compareIgnoreCase(inputString, comparisonString);
        obj.endsWith(inputString, suffix);
    }

    public void capitalizeFirstLetter(String str) {
        if (str != null && !str.isEmpty()) {
            System.out.println("Capitalized String: " + Character.toUpperCase(str.charAt(0)) + str.substring(1));
        }
    }

    public void isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    public void countCharacters(String str) {
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialChars++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }

    public void deleteConsonants(String str) {
        System.out.println("String without consonants: " + str.replaceAll("[^aeiouAEIOU]", ""));
    }

    public void isCharacterPresent(String str, char targetChar) {
        System.out.println("Is '" + targetChar + "' present: " + (str.indexOf(targetChar) != -1));
    }

    public void compareIgnoreCase(String str1, String str2) {
        System.out.println("Is equal ignoring case: " + str1.equalsIgnoreCase(str2));
    }

    public void endsWith(String str, String suffix) {
        System.out.println("Ends with another string: " + str.endsWith(suffix));
    }
}
