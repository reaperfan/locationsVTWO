package locationsVTWO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collections;

@Named
public class LocationDAO
{
    private List<Location> locations = Collections.synchronizedList(new ArrayList<>());

    public List<Location> findAll()
    {
        return locations;
    }

    public void save(String name, double lat, double lon)
    {
        Location loc = new Location();
        loc.setName(name);
        loc.setLat(lat);
        loc.setLon(lon);
        locations.add(loc);

    }

    public Location findById(long id)
    {
        for (Location loc : locations)
        {
            if (loc.getId().equals(id))
            {
                return loc;
            }
        }
        return null;
    }
    public void update(long id, String name, double lat, double lon)
    {
        for (Location loc : locations)
        {
            if (loc.equals(id))
            {
                loc.setName(name);
                loc.setLat(lat);
                loc.setLon(lon);
            }
        }
    }
    public void delete(long id)
    {
        Location removeloc = new Location();
        for (Location loc : locations)
        {
            if (loc.getId().equals(id))
            {
                removeloc = loc;
            }
        }
        locations.remove(removeloc);
    }
}
