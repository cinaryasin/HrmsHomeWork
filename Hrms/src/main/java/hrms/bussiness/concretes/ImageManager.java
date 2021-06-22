package hrms.bussiness.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hrms.bussiness.abstracts.ImageService;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;
import hrms.core.utilities.imageUploads.ImageUploadService;
import hrms.dataAccess.abstracts.ImageDao;
import hrms.entities.concretes.Image;
import lombok.var;

@Service
public class ImageManager implements ImageService{

	private ImageDao imageDao;
	private ImageUploadService imageUplodService;
	@Autowired
	public ImageManager(ImageDao imageDao,ImageUploadService imageUplodService) {
		super();
		this.imageDao = imageDao;
		this.imageUplodService=imageUplodService;
	}

	@Override
	public Result add(Image image,MultipartFile multipartFile) {
		Map<String,String> uploadImage = this.imageUplodService.uploadImageFile(multipartFile).getData();
		image.setUrl(uploadImage.get("url"));
		this.imageDao.save(image);
		return new SuccessResult("Image has been added.");
	}

	@Override
	public Result update(Image image,MultipartFile multipartFile) {
		Map<String,String> uploadImage = this.imageUplodService.uploadImageFile(multipartFile).getData();
		image.setUrl(uploadImage.get("url"));
		this.imageDao.save(image);
		return new SuccessResult("Image has been updated.");
	}

	@Override
	public DataResult<Image> findById(int id) {
		var result = this.imageDao.findById(id);
		if(result==null) {
			return new ErrorDataResult<>("Bulunamadı");
		}
		
		return new SuccessDataResult<>(result,"resim getirildi");
	}

	@Override
	public DataResult<List<Image>> findAll() {
		var result = imageDao.findAll();
		return new SuccessDataResult<>(result,"resimler getirildi");
	}
}
