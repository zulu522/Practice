public class ATMPinCompare {
    public static boolean validatePin(String pin) {
        return pin.length() == 4 && (pin.matches("[0-9]+")) || pin.length() == 6 && (pin.matches("[0-9]+"));
    }

    public static void main(String[] args) {
        //validatePin("a234");
        //validatePin(".234");
        //validatePin("090909");
        //validatePin("123");
        System.out.println(validatePin(".234"));
    }
}
