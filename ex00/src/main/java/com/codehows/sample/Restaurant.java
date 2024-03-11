package com.codehows.sample;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;
import lombok.Data;



@Component
@Data
public class Restaurant { 
	@Setter(onMethod_ = @Autowired)
	private Chef chef; 

}
