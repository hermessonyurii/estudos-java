public class Main08 {
    public static void main(String[] args) {

        /* tipos primimitos*/
        /* .... */
        /* Classes wrapper */
        /* .... */
        /* Operadores básicos */
        /* .... */
        /* Operador lógico*/
        /* .... */
        /* Estruturas condicionais - IF e ELSE */
        /* .... */
        /* Operadores ternários */
        /* .... */
        /*  Como usar o Switch Legacy */
        /* .... */

        /* Switch-Case-Inicialization */

        String dia = "Mar";
        String diaDaSemana = switch (dia) {
            case "Seg", "Ter", "Qua", "Qui", "Sex" -> "Dia útil";
            case "Sab", "Dom" -> "Final de semana";
            default -> "Dia inválido";
        };

        System.out.println(diaDaSemana);
    }
}
