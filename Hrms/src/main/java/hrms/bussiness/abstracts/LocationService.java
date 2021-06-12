package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.Location;

public interface LocationService {

	Result add(Location location);
    Result update(Location location);
    Result delete(Location location);
    DataResult<List<Location>> findAll();
}
