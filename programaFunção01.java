
public class programaFunção01 {
    public static void main(String[] args) throws Exception {
        //10% garçom 
        //20% couvert
        //Pedro 80
        //Andre 50
        //Montanha 30
        //Amanda 100

        calculaImprimeConta( 80, "Pedro");
        System.out.println("");
        calculaImprimeConta(50,"Andre" );
        System.out.println("");
        calculaImprimeConta(30,"Montanha" );
        System.out.println("");
        calculaImprimeConta(100,"Amanda" );


        
    }
    public static void calculaImprimeConta (double conta, String Nome ) {

        double gourjeta = conta * 0.1;
        double couvert = conta * 0.2;
        double total = conta + gourjeta + couvert;
        System.out.println("Discriminação conta do " + Nome);
        System.out.println("Total consumido R$ " + conta);
        System.out.println("Gourjeta R$ " + gourjeta);
        System.out.println("Couvert R$ " + couvert);
        System.out.println("Total Geral do " + Nome + " R$ " + total);;


    }

    
}

