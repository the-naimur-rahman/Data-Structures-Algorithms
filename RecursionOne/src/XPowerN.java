public class XPowerN{
    public static int calcPower(int x, int n){
        if(x == 0){
            return 0;
        }

        if(n == 0){
            return 1;
        }

        int calcPowerN1 = calcPower(x, n-1);
        int calcPower = x * calcPowerN1;
        return calcPower;
    }

    public static void main(String[] args){
        int x = 2;
        int n = 5;

        int answer = calcPower(x, n);
        System.out.println("Answer: " + answer);
    }
}
