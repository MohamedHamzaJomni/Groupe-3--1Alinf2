
public class AmaniChamakh {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static String inverser(String chaine) {
        StringBuilder resultat = new StringBuilder();

        for (int i = chaine.length() - 1; i >= 0; i--) {
            resultat.append(chaine.charAt(i));
        }

        return resultat.toString();
    }

}
