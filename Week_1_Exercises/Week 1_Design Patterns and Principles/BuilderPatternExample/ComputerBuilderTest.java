package builderPattern;

public class ComputerBuilderTest {
    public static void main(String[] args) {
        // Create a Computer configuration
        Computer C1 = new Computer.Builder()
                .setCPU("Alder Lake")
                .setRAM("8GB")
                .setStorage("64GB SSD")
                .build();

        System.out.println("Basic Computer: " + C1);

        // Create a Computer configuration with GPU and Bluetooth enabled
        Computer C2 = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .enableBluetooth(true)
                .build();

        System.out.println("Gaming Computer: " + C2);

    }

}
