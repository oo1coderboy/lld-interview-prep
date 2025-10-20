package Lec4_Creational_design_patterns.abstract_design;

import Lec4_Creational_design_patterns.abstract_design.src.FurnitureFactory;
import Lec4_Creational_design_patterns.abstract_design.src.ModernFurniture;

public class ClientTest {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurniture();

        var chair = factory.createChair();
        chair.sitOn();
    }
}
