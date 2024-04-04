import java.util.Scanner;
class CPU {
    private double price;

	class Processor {
        private int numberOfCores;
        private String manufacturer;

        Processor(int numberOfCores, String manufacturer) {
            this.numberOfCores = numberOfCores;
            this.manufacturer = manufacturer;
        }

        void printProcessorInfo() {
            System.out.println("Processor Cores: " + numberOfCores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    public static class RAM {
        private int memory;
        private String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void printRAMInfo() {
            System.out.println("RAM Memory: " + memory + "GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    CPU(double price) {
        this.price = price;
    }

    void printPrice() {
        System.out.println("CPU Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter CPU price:");
        double price = scanner.nextDouble();
        CPU myCpu = new CPU(price);

        System.out.println("Enter number of cores for Processor:");
        int cores = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter manufacturer of Processor:");
        String processorManufacturer = scanner.nextLine();
        CPU.Processor myProcessor = myCpu.new Processor(cores, processorManufacturer);

        System.out.println("Enter memory size for RAM in GB:");
        int memory = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter manufacturer of RAM:");
        String ramManufacturer = scanner.nextLine();
        CPU.RAM myRAM = new CPU.RAM(memory, ramManufacturer);

        myCpu.printPrice();
        myProcessor.printProcessorInfo();
        myRAM.printRAMInfo();

        scanner.close();
    }
}
