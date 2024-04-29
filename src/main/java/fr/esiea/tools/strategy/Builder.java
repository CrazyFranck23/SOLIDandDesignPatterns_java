package fr.esiea.tools.strategy;

public abstract class Builder {
    protected IMaterial material;

    public void setMaterial(IMaterial material) {
        this.material = material;
    }

    public void startBuilding() {
        if (material != null) {
            System.out.println(material.getName());
        } else {
            // Default behavior or throw an exception if no material is set
            System.out.println("No material set");
        }
    }
}
