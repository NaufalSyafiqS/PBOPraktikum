import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Minta input A, operator, dan B
        System.out.print("Masukkan A operator B (contoh: 5 + 3): ");
        int A = scanner.nextInt();
        String operator = scanner.next();
        int B = scanner.nextInt();
        // Tentukan hasil berdasarkan operator
        int hasil = 0;
        switch (operator) {
            case "+":
                hasil = A + B;
                break;
            case "-":
                hasil = A - B;
                break;
            case "*":
                hasil = A * B;
                break;
            case "/":
                hasil = A / B;
                break;
            case "%":
                hasil = A % B;
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }
        // Tampilkan hasil
        System.out.println("Hasil: " + hasil);
    }
}
