package design.structural.facade;

public class Computer {
    private final Cpu cpu;
    private final Memory memory;
    private final Disk disk;

    public Computer() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void startComputer() {
        cpu.start();
        memory.start();
        disk.start();
    }

    public void closeComputer() {
        disk.close();
        memory.close();
        cpu.close();
    }
}
