import locationsVTWO.LocationDAO;
import locationsVTWO.LocationsService;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class LocationServiceTest
{
    private LocationDAO locdao = Mockito.mock(LocationDAO.class);
    private LocationsService locservice = new LocationsService(locdao);

    @Test
    public void testSaveLoc()
    {
        locservice.createLocation("Budapest",10,10);
        verify(locdao).save("Budapest",10,10);
    }
}
