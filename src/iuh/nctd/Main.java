package iuh.nctd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer computer = new Computer.ComputerBuilder("hdd", "ram")
                .build();

        Computer computer1 = new Computer.ComputerBuilder("hdd", "ram")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer);
        System.out.println(computer1);
    }
}
