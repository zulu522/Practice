class User {
    String email;
    String password;
    User(String email, String password) {
    }
}
class NewBalanceUser extends User{
    NewBalanceUser(String email, String password) {
        super(email, password);
    }
    NewBalanceUser user = new NewBalanceUser("DFSGFDGDFG", "DSFSDGFGDG");
}
