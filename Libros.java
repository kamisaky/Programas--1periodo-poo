class Libros{
    String nombre;
    String codigo;
    int cant;
    boolean disp;
    

    Libros(String nombre, String codigo, int cant, boolean disp){
        this.nombre = nombre;
        this.codigo = codigo;
        this.cant = cant;
        this.disp = disp;
      
    }

    void setNombre(String nombreNuevo){
		this.nombre = nombreNuevo;
		
  


	}
	 void prestar(boolean disponibilidad){
		this.disp = false;
		cant--;
		System.out.println("Se acaba de prestar el libro   "+nombre);
		if (cant == 0){
		this.nombre = "No hay mas copias disponibles para este libro    " +nombre;
		}
		
	}
	 void devolver(boolean disponibilidad){
		this.disp = true;
	 cant++;
		System.out.println("Se acaba de devolver el libro   "+nombre);
	}
	void consNombre(){
	System.out.println("Ingreso del primer titulo en biblioteca   ");
		this.nombre = (System.console().readLine());
		System.out.println("Sea creado satisfactoriamente el libro  "    + nombre);
	  System.out.println("Ingreso cantidad libros ");	
	  System.out.println("Cuantos libros quiere crear");
this.cant = Integer.parseInt (System.console().readLine());
	  System.out.println("Sean creado una cantidad de  "    + cant+"  para el libro  "  +nombre);
}
}
