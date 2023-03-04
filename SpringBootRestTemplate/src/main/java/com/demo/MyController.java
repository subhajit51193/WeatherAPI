package com.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.dto.Product;
import com.demo.dto.WeatherInfo;



@RestController
//@RequestMapping("api/test")
public class MyController {

	@Autowired
	private RestTemplate restTemplate;
	
	//------------------------------------
		//testing purpose only
	@GetMapping("/testAll")
	public String getTest() {
		
		String url = "http://localhost:8038/api/test/all";
		ResponseEntity<String> re =restTemplate.getForEntity(url, String.class);
		String result = re.getBody();
		return result;
		
	}
	//------------------------------------
	//testing purpose only
	@GetMapping("getProduct/{productId}")
	public ResponseEntity<Product> getProducthandler(@PathVariable("productId") Long productId){
		
		String url = "http://localhost:8038/api/user/productDetails/{productId}";
		Map<String, Object> map = new HashMap<>();
		map.put("productId", productId);
		ResponseEntity<Product> re = restTemplate.getForEntity(url, Product.class,map);
		return re;
	}
	//----------------------------------
	
	
	
	@GetMapping("/weather/{pincode}")
	public ResponseEntity<WeatherInfo> getWeatherhandler(@PathVariable("pincode") String pincode){
		
		String url = "http://api.openweathermap.org/data/2.5/weather?zip={pincode},in&units=metric&appid=05421eb90beaae51378b287142ff8554";
		Map<String, Object> map = new HashMap<>();
		map.put("pincode", pincode);
		ResponseEntity<WeatherInfo> re = restTemplate.getForEntity(url, WeatherInfo.class,map);
		return re;
	}
}
