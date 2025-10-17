public class Desktop {
    private String brand;
    private String processor;
    private int ramSize;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    public int getRamSize() { return ramSize; }
    public void setRamSize(int ramSize) { this.ramSize = ramSize; }

    public void upgradeRam(int extra) { ramSize += extra; }

    public static void main(String[] args) {
        Desktop d = new Desktop();
        d.setBrand("Lenovo");
        d.setProcessor("Intel i7");
        d.setRamSize(8);
        d.upgradeRam(8);

        System.out.println("Brand: " + d.getBrand());
        System.out.println("Processor: " + d.getProcessor());
        System.out.println("RAM: " + d.getRamSize() + "GB");
    }
}