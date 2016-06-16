public class CubeOfSix {

    public static void main(String[] args) {

        System.out.println(FastCubeRoot(636056));

    }

    private static int FastCubeRoot(int number) {

        int firstDigit, secondDigit;

        secondDigit = number % 10;
        secondDigit = (secondDigit * secondDigit * secondDigit) % 10;

        number /= 1000;

        for (int i = 1; i < 11; i++) {

            if (i * i * i > number) {
                firstDigit = i - 1;
                return firstDigit * 10 + secondDigit;
            }

        }

        return secondDigit;

    }


}
