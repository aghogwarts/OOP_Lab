/*
Implement a multithreaded program with two threads with the tasks as defined
1 - count the no of words which start with a vowel
2 - count the length of each word in a sentence

Both the threads should work on single input sentence same and above task should be repeated in a loop one after the other
*/

package Practice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    private static final String sentence = "The quick brown fox jumps over the lazy dog";
    private static final Lock lock = new ReentrantLock();
    private static volatile boolean task1Complete = false;

    public static void main(String[] args) {
        Thread vowelThread = new Thread(() -> {
            while (true) {
                lock.lock();
                if (!task1Complete) {
                    int vowelWordCount = countWordsStartingWithVowel(sentence);
                    System.out.println("Number of words starting with a vowel: " + vowelWordCount);
                    task1Complete = true;
                }
                lock.unlock();
            }
        });

        Thread wordLengthThread = new Thread(() -> {
            while (true) {
                lock.lock();
                if (task1Complete) {
                    countWordLengths(sentence);
                    task1Complete = false;
                }
                lock.unlock();
            }
        });

        vowelThread.start();
        wordLengthThread.start();
    }

    private static int countWordsStartingWithVowel(String sentence) {
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = word.toLowerCase().charAt(0);
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    private static void countWordLengths(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println("Length of each word:");
        for (String word : words) {
            System.out.println(word + ": " + word.length());
        }
    }
}
