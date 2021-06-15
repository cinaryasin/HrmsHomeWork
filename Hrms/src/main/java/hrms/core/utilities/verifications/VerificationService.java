package hrms.core.utilities.verifications;



public interface VerificationService {

	void sendVerificationCode(String email);

	String codeGenerator();
}
