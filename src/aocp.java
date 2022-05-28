import java.util.Scanner;
public class aocp {
    public static void main(String[] args) {
        double r,aci,dAlan,pi=3.14;
        Scanner input= new Scanner(System.in);
        System.out.print("Lutfen Dairenizin Yari Capini Giriniz(m) : ");
        r= input.nextDouble();
        System.out.print("Lutfen Daire Diliminizin Merkez Acisini Girin(Derece) : ");
        aci= input.nextDouble();
        dAlan=(aci/360)*((r*r)*pi);
        System.out.print("Daire Diliminizin Alani(m2) : "+ dAlan);
    }
}
