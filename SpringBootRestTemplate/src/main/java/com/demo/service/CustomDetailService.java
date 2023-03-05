package com.demo.service;

import com.demo.dto.WeatherInfo;
import com.demo.model.CustomDetail;

public interface CustomDetailService {

	public void addCustomDetail(WeatherInfo weatherInfo, String pincode);
}
