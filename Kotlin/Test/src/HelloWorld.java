import org.testng.annotations.Test;

public class HelloWorld {
    @Test
    {
        void test()
        {
            fail('not yet');
        }
    }

    public static void main(String[] args) {

        System.out.println("hello world");
        System.out.println(Calcul(6,2));
    }

    public static int Calcul(int number1, int number2){
        int somme = number1 +number2;
        return somme;
    }
}
