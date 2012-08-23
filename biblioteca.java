class Biblioteca{
    String nombre;
    String codigo;
	int cant;
    boolean disp;
    Libros[] baselibros;

    Biblioteca (){
    }

    Biblioteca( String _nombre,
                String _codigo,int _cant,
                boolean _disp,
                Libros[] _baselibros){
        nombre = _nombre;
        codigo = _codigo;
        cant = _cant;
		disp = _disp;
        baselibros = _baselibros;
    }

    void imprimirHistoria(){
        System.out.println("Base datos libros");
        
        for(int i=0; i<baselibros.length; i++){
            Libros temporal = baselibros[i];
			
            System.out.println(temporal.nombre+temporal.cant+temporal.codigo );
			
        }
    }

    public static void main(String[] args){
        Libros[] temas = new Libros[5];
        temas[0] = new Libros("Algebra lineal ", " 111  ", 2 , true);
        temas[1] = new Libros("logica computacional  ", " 112 ", 2 , true);
        temas[2] = new Libros("Programacion orientada objetos  ", " 113 ", 2 , true);
        temas[3] = new Libros("Teoria general de sistemas  ", " 114 ", 2 , true);
        temas[4] = new Libros("Calculo integral  ", " 115 ", 2  , true );
		temas[0].consNombre();
	//asignaturas[0].nombre = "Vectorial";
	//temas[0].setNombre("Vectorial Con Funcion");//cambie nombre primer libro funcion setnombre en libros esta definida
temas[1].prestar(false);//preste logica computacional arreglo 1
	temas[0].prestar(false);//preste algebra lineal pero ahora es vectorial en fn espero lo entiendan
        Biblioteca ejemplar = new Biblioteca("Rafael", "4444",6, true, temas);//creacion ejemplo ejuemplaR
temas[0].devolver(true);//se devuelve vectorial
temas[1].prestar(false);
ejemplar.imprimirHistoria();
    
    }
}
  

