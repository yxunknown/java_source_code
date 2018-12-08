/**
 * Operator.class
 * Created in Intelij IDEA
 * <p>
 * Write Some Describe of this class here
 *
 * @author Mevur
 * @date 12/05/18 20:50
 */
package taste;

public class Operator {
    public static void main(String[] args) {
        int base = 1024;
        int negativeBase = -1024;
        prinBin(base);
        prinBin(negativeBase);
    }

    public static void prinBin(int x) {
        System.out.println(Integer.toBinaryString(x));
    }
}
