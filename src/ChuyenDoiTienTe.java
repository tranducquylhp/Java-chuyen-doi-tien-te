import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        float dola;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dola muon chuyen doi: ");
        dola = scanner.nextFloat();

        double vnd = dola * 23000;
        System.out.println(dola+" $ = "+vnd+" VND");
    }
}
