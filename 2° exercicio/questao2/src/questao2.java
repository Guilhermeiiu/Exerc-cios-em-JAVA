import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for(;;){
                
            System.out.println("Quantos graus celcius?");
            double c = scanner.nextDouble();

            double convercao= (9 * c + 160) / 5;

            System.out.println("Em Fahrenheit é:  " +  convercao);

}
        }
        }  
}

    


