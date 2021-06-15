package hrms.bussiness.abstracts;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {

	Result add(VerificationCode code);

	DataResult<VerificationCode> getByUserIdAndVerificationCode(int userId, String verificationCode);

	Result update(VerificationCode code);
}
