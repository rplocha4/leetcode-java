class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int i : arr)
            if (i != 0)
                return false;
        return true;
    }
}