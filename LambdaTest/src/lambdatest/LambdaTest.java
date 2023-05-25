package lambdatest;

/**
 *
 * @author Alessandro Cazziolato
 */
public class LambdaTest {
    String msg = "test message";
    Getter getMsg = () -> msg; // very cool
    Getter getMsg1 = new Getter() {
        @Override
        public String get() {
            return msg;
        }
    };
    public static void main(String[] args) {

        LambdaTest test = new LambdaTest();
        System.out.println(test.coolMethod(test.getMsg));
		System.out.println("--" + test.coolMethod(test.getMsg1));
    }

    public String coolMethod(Getter g) {
        return g.get();
    }

}
