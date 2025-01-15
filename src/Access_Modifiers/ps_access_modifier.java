package Access_Modifiers;

class cylinder {
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfacearea() {
        return 2 * 3.14 * radius * radius * 2 * 3.14 * radius * height;
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class rectangal {
    private int length;
    private int bredth;

    public rectangal() {
        this.length = 4;
        this.bredth = 5;
    }

    public rectangal(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    public int getLength() {
        return length;
    }

    public int getBredth() {
        return bredth;
    }
}

public class ps_access_modifier {
    public static void main(String[] args) {
//        Access_Modifiers.cylinder cy= new Access_Modifiers.cylinder(34,23);
//        cy.setHeight(12);
//        System.out.println(cy.getHeight());
//        cy.setRadius(9);
//        System.out.println(cy.getRadius());
//
//        System.out.println(cy.surfacearea());
//        System.out.println(cy.volume());

        rectangal rc = new rectangal(5, 4);
        System.out.println(rc.getLength());
        System.out.println(rc.getBredth());
    }
}
