package herencia;

public class main {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.edad = 35;
		cliente.nombre = "Bill";
		cliente.telefono = 987456321;
		cliente.credito = 350000;

		
		System.out.println(" Edad:"  + cliente.edad + "\n Nombre: " + cliente.nombre + "\n Telefono: " + cliente.telefono + "\n Crédito: " + cliente.credito);
		
	}

}


class persona{
	int edad;
	String nombre;
	int telefono;
	
}

class Cliente extends persona {
	int credito;
}

class Trabajador extends persona {
	int salario;
}