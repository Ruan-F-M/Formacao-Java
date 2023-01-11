package anatomia.das.classes.pt3;

public class MyClass {
    public static void main(String[] args) {
        String firstName = "Ruan";
        String secondName = "França";

        String fullName = fullName(firstName, secondName);

        System.out.println(fullName);
    }

    public static String fullName (String firstName, String secondName) {
        return "Resultado do método " + firstName.concat(" ").concat(secondName);
    }
}
