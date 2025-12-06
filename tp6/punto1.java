package tp6;

public class punto1 {
    public static void main(String[] args) {
        // Ejemplo de uso
        System.out.println(puzzle(14, 10));
    }

    public static int puzzle(int base, int limite) {
        if (base > limite) {  // 1° Caso base
            return -1;
        } else {
            if (base == limite) {  //2° Caso base
                return 1;  
            } else {
                return (base * puzzle(base + 1, limite)); //Caso general
            }
        }
    }

}
