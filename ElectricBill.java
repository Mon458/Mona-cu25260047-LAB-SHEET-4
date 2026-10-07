class ElectricBill {
    int units;
    static double fixedCharge = 100;

    void calculateBill() {
        double rate = 5;
        double energyCharge = units * rate;
        double totalBill = energyCharge + fixedCharge;

        System.out.println("Units: " + units);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();

        int usedUnits = 100;
        e.units = usedUnits;

        e.calculateBill();
    }
}
