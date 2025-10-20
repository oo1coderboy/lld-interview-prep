package Lec4_Creational_design_patterns.abstract_design.src;

public class ModernFurniture implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
