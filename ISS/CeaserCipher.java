public class CeaserCipher {
    public static void main(String[] args) {
        String message = "Rahul";
        int shift = 3; // Number of positions to shift

        String encrypted = encrypt(message, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }

    // Encrypts the message using Caesar Cipher
    public static String encrypt(String message, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Decrypts the message using Caesar Cipher
    public static String decrypt(String message, int shift) {
        return encrypt(message, 26 - shift); // Decrypt by shifting in the opposite direction

    }

}
