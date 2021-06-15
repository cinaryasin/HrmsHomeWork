package hrms.core.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;



@Configuration
public class AppConfig {  
	
	
	@Bean
	public ModelMapper modelMapper() {
			
		return new ModelMapper();
	}
	
	
	@Bean 
	public Cloudinary cloudinary() {
		
	return	new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "daq9o8vev",
				"api_key", "593923554684137",
				"api_secret", "wCV7rozo6mBsHQGbuqjlC3WTGt4"
				));
	}

}