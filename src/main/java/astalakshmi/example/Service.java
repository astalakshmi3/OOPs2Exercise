package astalakshmi.example;
abstract class Service {
    abstract int id();

    abstract String name();

    abstract double basePrice();

    public static class WinterTireChange extends Service

    {
        @Override
        int id() {
            return 0;
        }

        @Override
        String name() {
            return "";
        }

        @Override
        double basePrice() {
            return 0;
        }

    }

}
