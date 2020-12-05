package model;

import java.util.Objects;

public class BangerPhone extends Phone
{
    private double total_cost;

    public BangerPhone(String t_p, String t_n)
    {
        super(t_p, t_n);
    }

    public BangerPhone(String t_n)
    {
        super("vodofone", t_n);
    }

    public void call(String tel_num)
    {
        super.call(tel_num);
        total_cost += 10;
    }

    public String toString()
    {
        String result;
        String calls ="";
        int count = 0;

        for(String c : calls_made)
        {
            calls += "\n\t\t"+c;
            count++;
        }

        result = "Phone: "+ tel_number +"  Provider: "+telecoms_provider;
        result += "\nCalls Made: "+ calls;
        result+="\nTotal Calls: "+ count;
        result+="\nTotal Cost: "+ total_cost+"\n\n";

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BangerPhone)) return false;
        BangerPhone that = (BangerPhone) o;
        return Double.compare(that.total_cost, total_cost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(total_cost);
    }
}