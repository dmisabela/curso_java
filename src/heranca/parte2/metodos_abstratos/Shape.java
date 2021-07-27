package heranca.parte2.metodos_abstratos;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
		
	}	

	public Shape(Color color) {

		this.color = color;
	}



	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	// quando declaro o método abstrato, é obrigatório
	// declarar a classe também como abstrata

}
