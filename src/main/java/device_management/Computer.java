package device_management;

import Behaviours.IInput;
import Behaviours.IOutput;

import java.util.ArrayList;

public class Computer {
    private int ram;
    private int hddSize;

    private IOutput outputDevice;
    private IInput inputDevice;

//
////    private ArrayList<IOutput> outputDevices;
//    private ArrayList<IInput> inputDevices;

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
//        this.inputDevices = new ArrayList<>();
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice) {
        this.outputDevice = outputDevice;
    }

    public IInput getInputDevice() {
        return inputDevice;
    }

    public void setInputDevice(IInput inputDevice) {
        this.inputDevice = inputDevice;
    }

    public String inputData(String data) {
        return this.inputDevice.inputData(data);
    }
//
//    public void setCurrentInputDevice(String type){
//        for (IInput inputDeviceToFind : inputDevices){
//            if (type == inputDeviceToFind.getType()){
//                this.inputDevice = inputDeviceToFind;
//            }
//        }
//    }
}
