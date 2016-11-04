package activitat2exercici2;

public class Nif {

    private static String missatge = "", nif = "";
    private static final char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    public static String letra;
    public static String numero;
    /**
     * Li arriba per parametre el dni en questió a revisar, un cop li arriba envia al metode dniCorrecte el nif per veure si te un format correcte
     * En cas de si, proba a validar-lo, per mostrar si en DNI es correcte o no.
     * @param dni
     * @return 
     */
    public static String esValid(String dni) {
        int num = 0;
        nif = dni;
        letra = nif.substring(nif.length() - 1);
        numero = nif.substring(0, nif.length() - 1);
        if (dniCorrecte(nif)) {
            try {
                num = Integer.parseInt(numero);
                missatge = dniValid(num);
            } catch (NumberFormatException e) {
                missatge = "Format Incorrecte";
            }
        } else {
            missatge = "Format Incorrecte";
        }
        return missatge;
    }
    /**
     * Comproba que la llarga del DNI sigui correcte.
     * @param dni
     * @return 
     */
    public static boolean dniCorrecte(String dni) {
        boolean valid = false;
        if (nif.length() < 8 || nif.length() > 9) {
            valid = false;
        } else {
            valid = true;
        }
        return valid;
    }
    /**
     * Comproba si el dni es valid o no.
     * @param num
     * @return 
     */
    public static String dniValid(int num) {

        num = Integer.parseInt(numero);

        if (String.valueOf(llista[num % 23]).equals(letra)) {
            missatge = "Nif Vàlid";
        } else {
            missatge = "Nif Invàlid";
        }
        return missatge;
    }

}
