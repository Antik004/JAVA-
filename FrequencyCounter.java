import java.util.*;

public class FrequencyCounter extends Thread {
    private String segment;
    private int[] frequency;

    public FrequencyCounter(String segment) {
        this.segment = segment;
        this.frequency = new int[256]; 
    }

    public void run() {
        for (int i = 0; i < segment.length(); i++) {
            char character = segment.charAt(i);
            if (character >= 0 && character < 256) {
                frequency[character]++;
            }
        }
    }

    public int[] getFrequency() {
        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String inputString = sc.nextLine();
        int stringLength = inputString.length();
        int numberOfThreads = 4;
        int segmentSize = stringLength / numberOfThreads;

        FrequencyCounter[] threads = new FrequencyCounter[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            int startIndex = i * segmentSize;
            int endIndex;
            if (i == numberOfThreads - 1) {
                endIndex = stringLength;
            } else {
                endIndex = startIndex + segmentSize;
            }
            String segment = "";
            for (int j = startIndex; j < endIndex; j++) {
                segment += inputString.charAt(j);
            }
            threads[i] = new FrequencyCounter(segment);
            threads[i].start();
        }

        int[] totalFrequency = new int[256];
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
                int[] segmentFrequency = threads[i].getFrequency();
                for (int j = 0; j < 256; j++) {
                    if (segmentFrequency[j] > 0) {
                        totalFrequency[j] += segmentFrequency[j];
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        char mostFrequentChar = 0;
        int maximumFrequency = 0;
        for (int i = 0; i < 256; i++) {
            if (totalFrequency[i] > maximumFrequency) {
                maximumFrequency = totalFrequency[i];
                mostFrequentChar = (char) i;
            }
        }

        System.out.println("The most frequent character is '" + mostFrequentChar + "' with a frequency of " + maximumFrequency);
    }
}
