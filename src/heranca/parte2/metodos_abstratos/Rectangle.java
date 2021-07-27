package heranca.parte2.metodos_abstratos;

public class Rectangle extends Shape {
	
/* assim que fizer isso dar� um erro dizendo que a classe
 � obrigada a implementar o m�todo Shape.area(), pois j� que a
classe n�o � abstrata e herda a Shape, deve implementar seu m�todo */
	
	
	private Double width;
	private Double height;
	
	public Rectangle () {
		super();		
	}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
	@Override
	public double area() {
		return width * height;
	}
	

}
