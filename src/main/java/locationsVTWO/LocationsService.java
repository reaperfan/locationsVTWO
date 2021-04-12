package locationsVTWO;
import java.util.List;
import javax.inject.Named;
import javax.inject.Inject;

@Named
public class LocationsService
{
    private LocationDAO locationDAO;

    @Inject
    public LocationsService(LocationDAO locationDAO)
    {
        this.locationDAO = locationDAO;
    }

    public List<Location> listLocations()
    {
        return locationDAO.findAll();
    }
    public void createLocation(String name, double lat, double lon)
    {
        locationDAO.save(name,lat,lon);
    }
    public Location getLocationById(long id)
    {
        return locationDAO.findById(id);

    }
    public void updateLocation(long id, String name, double lat, double lon)
    {
        locationDAO.update(id,name,lat,lon);
    }
    public void deleteLocation(long id)
    {
        locationDAO.delete(id);
    }
}