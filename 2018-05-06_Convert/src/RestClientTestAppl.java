import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import telran.calculator.dto.CalculateData;
import java.io.*;
import java.util.Scanner;



public class RestClientTestAppl {
static RestTemplate restTemplate = new RestTemplate();
static HttpHeaders headers = new HttpHeaders();
static HttpEntity<String> requestEntity = new HttpEntity<>(headers);
static String url = "https://calculatordima.herokuapp.com/calculate";

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String z = in.nextLine();
		int a = in.nextInt();
		int b = in.nextInt();
		HttpEntity<CalculateData> postEntity = new HttpEntity<CalculateData>
		(new CalculateData(z, a, b), headers);
		ResponseEntity<Integer> response =restTemplate.exchange(url, HttpMethod.POST, 
				postEntity, Integer.class);
		int res = response.getBody();
		System.out.println(res);
		

	}

}
