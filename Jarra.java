public class Jarra {
	
	//atributos
 	private int cantidad;
	private int capacidad;

	//constructor
	public Jarra(int capacidadInicial){
		if(capacidadInicial<=0){
			throw new RuntimeException("ERROR: no se pueden crear jarras
						con capacidad menor o igual que cero.");
		}
		this.capacidad=capacidadInicial;
	}

	// metodos
	// 1
	public int capacidad() {
		return this.capacidad;
	}
	
	public int cantidad() {
		return this.cantidad;
	}
	// 2
	public void llena() {
    		this.cantidad = this.capacidad;
	}

	public void vacia() {
   		this.cantidad = 0;
	}

	// 3


	public void metodoComunitario(){
	// Comentario incluido para pruebas
		System.out.println("Aqui escribimos todos");
		System.out.println("Julia del Río Toledo");
		System.out.println("Adriana Jubera Garcia");
	}