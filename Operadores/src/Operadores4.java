public class Operadores4 {
    public static void main (String[] args){

        int numero1 = 10;
        int numero2= 20;

        boolean trueOrFalse = numero1 == numero2;
//      false
        
        trueOrFalse = numero1 != numero2;
//      true

        trueOrFalse = numero1 > numero2;
//      false

        trueOrFalse = numero1 < numero2;
//      true

        String nomeUm = "Nathan";
        String nomeDois = "José";

        System.out.println(nomeUm != nomeDois ? "Nomes diferentes": "Nomes idênticos");
        System.out.println(nomeUm.equals(nomeDois));
    }
}
 