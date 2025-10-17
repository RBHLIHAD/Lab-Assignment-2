public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getStorageCapacity() { return storageCapacity; }
    public void setStorageCapacity(int storageCapacity) { this.storageCapacity = storageCapacity; }

    public void increaseStorage(int extra) { storageCapacity += extra; }

    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.setBrand("Samsung");
        s.setModel("Galaxy S24");
        s.setStorageCapacity(128);
        s.increaseStorage(64);

        System.out.println("Brand: " + s.getBrand());
        System.out.println("Model: " + s.getModel());
        System.out.println("Storage: " + s.getStorageCapacity() + "GB");
    }
}