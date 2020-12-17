public class Cylinder extends Circle {
    private double height = 5.0;

    public Cylinder(){}

    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius, String color, boolean filled, double height){
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*super.getRadius()*super.getRadius()*this.height;
    }

    @Override
        public String toString() {
            return "which is a subclass of "
                    + super.toString()
                    + " Volume = "
                    + getVolume();
        }
    }

