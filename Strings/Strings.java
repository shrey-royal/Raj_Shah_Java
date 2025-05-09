public class Strings {
    public static void main(String[] args) {
        String str = "This is a String";
        
        //Methods
        // System.out.println(str.charAt(2));
        // System.out.println(str.length());
        // System.out.println(str.substring(10));
        // System.out.println(str.substring(10, 13));
        // System.out.println(str.indexOf(' ', 5));
        // System.out.println(str.indexOf(" ", 5));
        // System.out.println(str.lastIndexOf("a"));
        // System.out.println(str.startsWith("This"));
        // System.out.println(str.endsWith("ing"));
        // System.out.println("HeLlO".toLowerCase());
        // System.out.println("HeLlO".toUpperCase());
        // str = "   sd sd    ";
        // System.out.println("\n" + str + " -> " + str.length() + "\n" + str.trim() + " -> " + str.trim().length());
        // System.out.println(str.replace("i", "I"));
        // System.out.println(str.contains("  "));
        // str = "";
        // System.out.println(str.isEmpty());

        // int i = 2345;
        // str = String.valueOf(i);
        // System.out.println(str);
        // int a = Integer.parseInt(str);
        // System.out.println(a);

        // char a[] = new char[str.length()];
        // a = str.toCharArray();

        // for (char c : a) {
        //     System.out.print(c + ", ");
        // }
        // System.out.println();


        // System.out.println("Hello".equals("hello"));
        // System.out.println("Hello".equalsIgnoreCase("hello"));
        // System.out.println("Hello".compareTo("hello"));
        // System.out.println("Hello".compareToIgnoreCase("hello"));

    }
}

/*
String Methods:
1. charAt(int index): Returns the character at the specified index.
2. length(): Returns the length of the string.
3. substring(int beginIndex): Returns a substring starting from the specified index.
4. substring(int beginIndex, int endIndex): Returns a substring within the specified range.
5. indexOf(int ch): Returns the index of the first occurrence of a specified character.
6. indexOf(int ch, int fromIndex): Returns the index of the first occurrence of a specified character starting from the given index.
7. indexOf(String str): Returns the index of the first occurrence of a specified substring.
8. lastIndexOf(int ch): Returns the index of the last occurrence of a specified character.
9. lastIndexOf(int ch, int fromIndex): Returns the index of the last occurrence of a specified character before the given index.
10. lastIndexOf(String str): Returns the index of the last occurrence of a specified substring.
11. startsWith(String prefix): Checks if the string starts with the specified prefix.
12. endsWith(String suffix): Checks if the string ends with the specified suffix.
13. toLowerCase(): Converts the string to lowercase.
14. toUpperCase(): Converts the string to uppercase.
15. trim(): Removes leading and trailing white spaces.
16. replace(char oldChar, char newChar): Replaces all occurrences of a character with another character.
17. replace(CharSequence target, CharSequence replacement): Replaces all occurrences of a specified CharSequence.
18. contains(CharSequence s): Checks if the string contains the specified sequence of characters.
19. isEmpty(): Checks if the string is empty.
20. valueOf(Object obj): Returns the string representation of an object.
*/

/*
Tasks:
1. Count Vowels in a String

Problem: Write a method that takes a string and returns the number of vowels (a, e, i, o, u) in it.
Example:
Input: "hello"
Output: 2

2. Check Palindrome

Problem: Write a method that checks if a given string is a palindrome (reads the same forwards and backwards). Ignore case.
Example:
Input: "Madam"
Output: true

3. Reverse a String

Problem: Write a method that reverses a given string without using built-in reverse functions.
Example:
Input: "java"
Output: "avaj"

4. Remove Spaces from String

Problem: Write a method that removes all whitespace characters from a string.
Example:
Input: "  j a v a  "
Output: "java"

5. Find First Repeating Character

Problem: Write a method that returns the first repeating character in a string. If none, return '0'.
Example:
Input: "abca"
Output: 'a'

*/