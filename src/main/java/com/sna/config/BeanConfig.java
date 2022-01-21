package com.sna.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sna.repository.ProxyBDD;


@Configuration
public class BeanConfig {

	@Bean
	public ProxyBDD initData() {
		ProxyBDD data = new ProxyBDD();
		data.loadData("c:/Users/emman/OneDrive/Bureau/sna.json");
		return data;
	}
}

