class CharacterStringLiterals {
    public static void main(String[] args) {
        char a = 'A';
        String b = "Hello";
        
        System.out.println("Character Literal: " + a);
        System.out.println("ASCII Value: " + (int) a);
        
        System.out.println("String Literal: " + b);
        
        for (int i = 0; i < b.length(); i++) {
            System.out.println("Character: " + b.charAt(i) + " ASCII Value: " + (int) b.charAt(i));
        }
    }
}
