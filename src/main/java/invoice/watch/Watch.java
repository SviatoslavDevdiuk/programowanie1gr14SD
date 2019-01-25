package invoice.watch;

public class Watch {

    private String modelName;
    private double price;
    private String brand;
    private braceletMaterial brasletMaterial;
    private TypeOfMovement typeOfMovement;
//    private String feateres;

    public Watch(String modelName, double price, String brand, braceletMaterial brasletMaterial, TypeOfMovement typeOfMovement) {
        this.modelName = modelName;
        this.price = price;
        this.brand = brand;
        this.brasletMaterial = brasletMaterial;
        this.typeOfMovement = typeOfMovement;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public braceletMaterial getBrasletMaterial() {
        return brasletMaterial;
    }

    public void setBrasletMaterial(braceletMaterial brasletMaterial) {
        this.brasletMaterial = brasletMaterial;
    }

    public TypeOfMovement getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(TypeOfMovement typeOfMovement) {
        this.typeOfMovement = typeOfMovement;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "modelName='" + modelName + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", brasletMaterial=" + brasletMaterial +
                ", typeOfMovement=" + typeOfMovement +
                '}';
    }
}

//    public String getFeateres() {
//        return feateres;
//    }
//
//    public void setFeateres(String feateres) {
//        this.feateres = feateres;
//    }

