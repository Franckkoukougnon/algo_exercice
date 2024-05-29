import java.util.Scanner;

public class Photocopie_Magasin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour, bienvenue dans notre magasin de photocopie");
        System.out.println("Combien de photocopies voulez-vous faire ?");
        int nbPhotocopies = scanner.nextInt();
        double totalCost = 0;
        if (nbPhotocopies <= 10) {
            totalCost = nbPhotocopies * 0.25;
        } else if (nbPhotocopies <= 30) {
            totalCost = 10 * 0.25 + (nbPhotocopies - 10) * 0.20;
        } else {
            totalCost = 10 * 0.25 + 20 * 0.20 + (nbPhotocopies - 30) * 0.10;
        }

        // Calculate

        System.out.println("Le coût total est de " + totalCost + " euros");

        // Close the scanner
        scanner.close();



    }








}
