package astalakshmi.example;

import javax.swing.*;

abstract class Service {
    private int id;
    private String name;
    protected double basePrice;

    Service(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    //abstract methods
    public abstract int CalculateServicePrice();

    public int getId() {
        return id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }


    public static class WinterTireChange extends Service {
        private int storagefee = 200;
        private int numberOfTires = 4;

        public WinterTireChange(int id, String name, double basePrice, int storagefee, int numberOfTires) {
            super(id, name, basePrice);
            this.numberOfTires = numberOfTires;
            this.storagefee = storagefee;
        }

        @Override
        public int CalculateServicePrice() {
            return (int) (getBasePrice() + (numberOfTires * 15) + (storagefee));
        }
    }
        public static class SummerTireChange extends Service {
            private int discount = 200;
            private int numberOfTires = 4;

            public SummerTireChange(int id, String name, double basePrice, int discount, int numberOfTires) {
                super(id, name, basePrice);
                this.numberOfTires = numberOfTires;
                this.discount = discount;
            }

            @Override
            public int CalculateServicePrice() {
                return (int) (getBasePrice() + (numberOfTires * 20) - (discount));
            }
        }
    }



