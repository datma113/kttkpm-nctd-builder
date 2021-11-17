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

        Student student = new Student.StudentBuilder(1 ,"nguyễn công Thành Đạt", "DHKTPM14", 21, true)
                .setAddress("Vũng Tàu")
                .setNationality("Việt Nam")
                .setReligion("Rome Catholic")
                .build();
        System.out.println(student);
    }
}
