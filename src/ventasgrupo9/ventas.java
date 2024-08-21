/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventasgrupo9;

/**
 *
 * @author INTERPOL
 */
import java.util.Scanner;

public class ventas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registro del nombre del vendedor y su sueldo mensual
        System.out.print("Ingrese el nombre del vendedor: ");
        String nombreVendedor = scanner.nextLine();

        System.out.print("Ingrese el sueldo mensual del vendedor: ");
        double sueldoMensual = scanner.nextDouble();

        // Registro de las tres ventas
        System.out.print("Ingrese el monto de la primera venta: ");
        double venta1 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la segunda venta: ");
        double venta2 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la tercera venta: ");
        double venta3 = scanner.nextDouble();

        // Calcular la comisión (10% de las ventas)
        double totalVentas = venta1 + venta2 + venta3;
        double comision = totalVentas * 0.10;
        sueldoMensual = sueldoMensual + comision;
      

        // Mostrar los resultados
        System.out.println("\n--- Detalles del Vendedor ---");
        System.out.println("Nombre del vendedor: " + nombreVendedor);
        System.out.println("Comisión por ventas: S/ " + comision);        
        System.out.println("Sueldo mensual neto es: S/ " + sueldoMensual);
        
        //cambio realizado 22-48
        
    }
    
}
