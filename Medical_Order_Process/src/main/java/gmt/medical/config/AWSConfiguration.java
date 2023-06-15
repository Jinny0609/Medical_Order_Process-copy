package gmt.medical.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;


@Configuration
@EnableWebMvc
public class AWSConfiguration implements WebMvcConfigurer {
	
	@Value("${aws.accesskey}")
	private String accessKey;

	@Value("${aws.secretkey}")
	private String secretKey;
	
	@Bean
	public AwsCredentialsProvider awsCredentialsProvider() {
		AwsBasicCredentials awsCredentials = AwsBasicCredentials.create(accessKey, secretKey);
		return StaticCredentialsProvider.create(awsCredentials);
	}	
	
	@Bean
	public S3Client s3Client() {
		return S3Client.builder()
				.region(Region.AP_NORTHEAST_2)
				.credentialsProvider(awsCredentialsProvider())
				.build();	
	}
}
