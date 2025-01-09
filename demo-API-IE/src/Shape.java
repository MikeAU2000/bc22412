public abstract class Shape {
  private Color color;

  public Shape(){}

  public Shape(Color color) {
    this.color = color;
  }


  public Color getColor() {
    return this.color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  abstract double area();

  public static Shape create(char ref,Color color){
    switch(ref) {
      case 'C':
        return new Circle(color, 3);
      case 'T':
        return new Traggle();
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    Shape [] shapes= new Shape[3];
    Traggle traggle= new Traggle();
    Circle circle= new Circle(Color.BLUE, 30);
    Circle circle1= new Circle(Color.BLUE, 25);
    shapes[0]= traggle;
    shapes[1]= circle;
    shapes[2]= circle1;
    for (Shape shape : shapes) {
      System.out.println(shape.area());
      if(shape instanceof Circle){
        Circle circle0= (Circle)shape;
        System.out.println(circle.getRadius());
      }
      
    Shape circle11=Shape.create('C',Color.RED);

  }

}

  
}
