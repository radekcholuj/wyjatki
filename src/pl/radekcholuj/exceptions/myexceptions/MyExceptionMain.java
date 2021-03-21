package pl.radekcholuj.exceptions.myexceptions;


public class MyExceptionMain {
    public static void main(String[] args) {
        String pass1 = "abc";
        String pass2 = "abc";
        String pesel1 = "87061800873";
        String pesel2 = "93061800872";

        try {
            Utils.isValidPassword(pass1, pass2);
            Utils.isValidEmail("aswewqewee@wp.pl");
            Utils.isValidPesel(pesel1, pesel2);
        } catch (PasswordException | EmailException | PeselException e) {
            System.out.println(e.getMessage());
        }
    }
}
