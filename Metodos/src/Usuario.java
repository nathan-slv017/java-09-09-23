public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.status();
        smartTv.mudarDeCanal(20);
        smartTv.power();
        smartTv.status();
    }
}
