package com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Main {

	private Double temp;
	private Double feels_like;
	private Double temp_min;
	private Double temp_max;
	private Long pressure;
	private Long humidity;
	private Long sea_level;
	private Long grnd_level;
}
