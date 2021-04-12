package locationsVTWO;

public class Location
{
    private Long id;
    private String name;
    private double lat;
    private double lon;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getLat()
    {
        return lat;
    }

    public void setLat(double lat)
    {
        this.lat = lat;
    }

    public double getLon()
    {
        return lon;
    }

    public void setLon(double lon)
    {
        this.lon = lon;
    }


    public String toString()
    {
        return this.name + " " + this.lat +  " " + this.lon;
    }
}
