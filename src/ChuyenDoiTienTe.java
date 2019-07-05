import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;

        System.out.println("Nhap so USD :");
        double USD = scanner.nextDouble();

        double Ketqua = USD*rate;

        System.out.println(Ketqua);
    }
}
