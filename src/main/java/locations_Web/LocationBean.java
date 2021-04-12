package locations_Web;

import javax.ejb.Singleton;
import java.util.Arrays;
import java.util.List;

@Singleton
public class LocationBean
{
    private List<Location> locationList = Arrays.asList(
            new Location[]
            {
                new Location("Budapest", 10, 10),
                new Location("Prága", 20, 20)
            }
    );

    public List<Location> listLocations()
    {
        return locationList;

    }

}
