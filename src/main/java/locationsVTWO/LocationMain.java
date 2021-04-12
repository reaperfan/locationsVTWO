package locationsVTWO;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import java.util.List;

public class LocationMain
{
    public static void main(String[] args)
    {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize())
        {
            LocationsService service  = container.select(LocationsService.class).get();
            service.createLocation("Budapest",10,10);
            List<Location> locations = service.listLocations();
            System.out.println(locations);

        }
    }
}
