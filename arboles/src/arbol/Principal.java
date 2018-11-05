package arbol;
class Principal{
	public static void main(String[] args){
		
		Expresion e = new Expresion("(a-b)*c+d");
		//System.out.print("teclee la exprsion ");
		//Expresion e = new Expresion();
		ArbolExp a = new ArbolExp(e.prefija());
		System.out.print(" Exprsion en notacion PreOrden : ");
		Recorrido.preOrden(a.getRaiz()); 
		System.out.print("\n Expresion en notacion InOrden : ");
		Recorrido.inOrden(a.getRaiz()); 
		System.out.print("\n Expresion en notacion PostOrden : ");
		Recorrido.postOrden(a.getRaiz()); 
		System.out.println();
	}
}