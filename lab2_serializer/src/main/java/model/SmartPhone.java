package model;

import java.util.Objects;

public class SmartPhone extends Phone
{
    private String IP_address;

    public SmartPhone(String pn, String ip)
    {
        super("kyivstar", pn);
        IP_address = ip;
    }

    public void call(String tel_num)
    {
        calls_made.add(tel_num);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "IP_address='" + IP_address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone)) return false;
        SmartPhone that = (SmartPhone) o;
        return Objects.equals(IP_address, that.IP_address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IP_address);
    }


}