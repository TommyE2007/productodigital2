import java.util.Scanner;

public class MainProducto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX = 3;

        ProductoDigital[] productos = new ProductoDigital[MAX];

        String nombre;
        double precio;
        int stock;

        for (int i = 0; i < productos.length; i++) {

            System.out.println("\nPRODUCTO " + (i + 1));

            System.out.print("Nombre: ");
            nombre = sc.nextLine();

            System.out.print("Precio: ");
            precio = Double.parseDouble(sc.nextLine());

            System.out.print("Stock: ");
            stock = Integer.parseInt(sc.nextLine());

            productos[i] = new ProductoDigital(nombre, precio, stock);
        }

        System.out.println("\nLISTA DE PRODUCTOS");

        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrarInfo();
        }

        sc.close();
    }
}
