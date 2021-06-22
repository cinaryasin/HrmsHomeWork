package hrms.bussiness.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.Image;

public interface ImageService {

	Result add(Image image,MultipartFile multipartFile);
    Result update(Image image,MultipartFile multipartFile);
    DataResult<Image> findById(int id);
    DataResult<List<Image>> findAll();
}
