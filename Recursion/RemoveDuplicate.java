public class RemoveDuplicate {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == false) {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
        }
        removeDuplicates(str, idx + 1, newStr, map);
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    }
}
