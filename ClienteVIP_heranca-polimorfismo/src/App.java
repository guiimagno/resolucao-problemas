public class App {
    public static void main(String[] args) throws Exception {
        Cliente[] clientes;

        clientes = new Cliente[5];

        clientes[0] = new Cliente("Gui", "gui@email", 1000);
        clientes[1] = new Cliente("Cris", "cris@email", 1000);
        clientes[2] = new Cliente("Guirra", "guirra@email", 5000);
        clientes[3] = new ClienteVIP("Clara", "clara@email", 20000, 500);
        clientes[4] = new ClienteVIP("Marlo", "Marlo@email", 1000, 500);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // // comprar
        // if (v.fazerCompra(650)) {
        // System.out.println("Compra OK");
        // } else {
        // System.out.println("Sem saldo");
        // }

        // System.out.println(v);

    }
}
