import java.util.*;

class myProg implements Runnable {
    private String segment;
    private int[] frequency;

    public myProg(String segment) {
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
        String str = sc.nextLine();
        int strlen = str.length();
        int nthread = 4;
        int segmentSize = strlen / nthread;

        myProg[] tasks = new myProg[nthread];
        Thread[] threads = new Thread[nthread];

        for (int i = 0; i < nthread; i++) {
            int start = i * segmentSize;
            int end;
            if (i == nthread - 1) {
                end = strlen;
            } else {
                end = start + segmentSize;
            }

            String segment = "";
            for (int j = start; j < end; j++) {
                segment = segment + str.charAt(j);
            }
            tasks[i] = new myProg(segment);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        int[] totalFrequency = new int[256];
        for (int i = 0; i < nthread; i++) {
            try {
                threads[i].join();
                int[] segmentFrequency = tasks[i].getFrequency();
                for (int j = 0; j < 256; j++) {
                    if (segmentFrequency[j] > 0) {
                        totalFrequency[j] += segmentFrequency[j];
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }

        char mostFrequentChar = 0;
        int maximumFrequency = 0;
        for (int i = 0; i < 256; i++) {
            if (totalFrequency[i] > maximumFrequency) {
                maximumFrequency = totalFrequency[i];
                mostFrequentChar = (char)i;
            }
        }

        System.out.println("The most frequent character is '" + mostFrequentChar + "' with a frequency of " + maximumFrequency);
    }
}
