import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String platNomor = scanner.nextLine();

        String[] platNomorArray = platNomor.split(" ");
        boolean berhenti = false;

        for (String plat : platNomorArray) {
            int gabunganAngka = Integer.parseInt(plat.replaceAll("[^0-9]", ""));
            if ((gabunganAngka - 999999) % 5 == 0) {
                berhenti = true;
                break;
            }
        }
        if (berhenti) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
