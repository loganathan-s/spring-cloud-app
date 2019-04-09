package com.logan.microservices.limitsservice;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class LimitConfiguration {
	@Getter
	@Setter
	private int maximum;
	@Getter
	@Setter
	private int minimum;

}
