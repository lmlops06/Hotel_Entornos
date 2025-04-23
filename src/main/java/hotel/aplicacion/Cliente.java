/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/** Esta clase representa al cliente del hotel que, una vez registrado, podrá realizar su reserva*/

/***/
package hotel.aplicacion;
import java.util.Scanner;
/**Esta clase representa al cliente del hotel
 * Una vez registrado, podrá realizar una reserva
 */

/**
 *
 * @author Laura
 */
public class Cliente {
	/**Este es un atributo estático, asigna un número identificativo a cada cliente que no cambia, es fijo*/
    private static int contadorClientes = 0;
    private int codigo;
    private String nombre;
    private String dni;
    private String telefono;
    

    //metodo constructor
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
        Utilidades.validarDNI(dni); 
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.codigo = obtenerNumeroCliente();
    }

    
    
    /**con este metodo se obtiene el número fijo que se le asigna a cada cliente
     * aumenta en uno cada vez que damos de alta un nuevo cliente
     */
        private static int obtenerNumeroCliente() {
        contadorClientes++;
        return contadorClientes;
    }
        
			
        	
    //metodos getter y setter
    public static int getContadorClientes() {
			return contadorClientes;
		}



		public static void setContadorClientes(int contadorClientes) {
			Cliente.contadorClientes = contadorClientes;
		}



		public int getCodigo() {
			return codigo;
		}



		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getDni() {
			return dni;
		}



		public void setDni(String dni) {
			this.dni = dni;
		}



		public String getTelefono() {
			return telefono;
		}



		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

/**Este metodo devuelve toda la información adquirida del cliente en formato de texto(String)*/

	public String mostrarInformacion() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", DNI: " + dni + ", Teléfono: " + telefono;
    }
}
