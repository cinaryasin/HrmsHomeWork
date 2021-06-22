package hrms.core.utilities.imageUploads;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import hrms.core.results.DataResult;


public interface ImageUploadService {

	DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
