public class Rectangle {
    private double length;
    private double width;

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10.5);
        r.setWidth(5.5);

        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
    }
}