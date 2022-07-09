public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        Character firstChar = name.charAt(0);
        if (firstChar.equals('R') || firstChar.equals('r')) {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }

        public static void main (String[]args){
            System.out.println(areYouPlayingBanjo("Martin"));
        }
    }

