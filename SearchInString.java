

public class SearchInString {
    public static void main(String[] args) {
        String name = "Aditya";

        System.out.println( search(name, 'u'));

    }

    static boolean search(String name, char tar) {
        for (int i = 0; i < name.length(); i++) {
            if (tar == name.charAt(i)) ;

            return true;
        }
        return false;
    }
}
