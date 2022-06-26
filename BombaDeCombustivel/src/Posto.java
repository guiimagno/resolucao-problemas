public class Posto {
    public static void main(String[] args) throws Exception {
        BombaCombustivel b1, b2;
        b1 = new BombaCombustivel("Gasolina", 8.99f);
        b2 = new BombaCombustivel("Etanol", 6.99f);

        b1.puxarGancho();
        b1.abastecerPorLitros(20);
        b1.voltarGancho();

        b2.puxarGancho();
        b2.abastecerPorValor(50);
        b2.voltarGancho();
    }
}
