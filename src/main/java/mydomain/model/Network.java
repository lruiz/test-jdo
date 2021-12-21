package mydomain.model;

import java.util.Collection;
import java.util.HashSet;

public class Network {
    private String name;
    private Collection<Device> devices = new HashSet<>();

    public Network(String name) {
        this.name = name;
    }

    public Collection<Device> getDevices() {
        return devices;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }
}
