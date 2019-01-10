package com.gx.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

// 这个类和配置文件的效果一样，如果有配置文件的话，就可以不用这个类了
@org.springframework.context.annotation.Configuration
public class MyBatisConfig {
	@Bean
	public ConfigurationCustomizer configurationCustomizer() {
		// 代码方式改为lambda支持
		return (Configuration configuration) -> configuration.setMapUnderscoreToCamelCase(true);
//    return new ConfigurationCustomizer() {
//      @Override
//      public void customize(Configuration configuration) {
//        // 开启驼峰命名规则
//        configuration.setMapUnderscoreToCamelCase(true);
//      }
//    };
	}

}

