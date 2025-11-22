public class removeRepeat {
    public static void main(String[] args) {
        System.out.println(process("azza"));      // zz
        System.out.println(process("aabbcca"));   // bbcc
        System.out.println(process("aabbaa"));    // (empty)
        System.out.println(process("abc"));
    }

     public static String process(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean foundRepeat;

        do {
            foundRepeat = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    char repeatChar = sb.charAt(i);
                    // Remove all occurrences of this char
                    int j = 0;
                    while (j < sb.length()) {
                        if (sb.charAt(j) == repeatChar) sb.deleteCharAt(j);
                        else j++;
                    }
                    foundRepeat = true;
                    break; // restart scan since string changed
                }
            }
        } while (foundRepeat);

        return sb.toString();
    }
}
