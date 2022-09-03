public class App {

    public static int somaPares(int n){
        if(n > 0){
           int par = n % 2 == 0  ? 1 : 0;
           return par + somaPares(n - 1);
        }else{
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        somaPares(10);
    }
}
