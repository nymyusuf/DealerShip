public class Brand {
    public enum Brands {
        FORD, CHEVROLET, TOYOTA, HONDA, NISSAN, BMW, MERCEDES, AUDI, VOLKSWAGEN, HYUNDAI, KIA
    }

    protected Brands brand;

    public Brand() {
    }

    public Brand(Brands brand) {
        this.brand = brand;
    }

    public Brands getBrand() {
        return brand;
    }

    public String getBrandName() {
        return brand.name();
    }
}
