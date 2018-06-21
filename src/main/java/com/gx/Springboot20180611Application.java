package com.gx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.@Mapper或者@MapperScan都是将接口扫描装配到容器中，<br>
 * 其中@Mapper:标注在接口上面，<br>
 * 其中@MapperScan：一般标注在程序的开始位置，是扫描指定的包，把包中的接口装配到容器中，如果用到了这个了，接口上面的可以不标注@Mapper<br>
 */
@MapperScan(value = "com.gx.mapper")
@SpringBootApplication
public class Springboot20180611Application {

  public static void main(String[] args) {
    SpringApplication.run(Springboot20180611Application.class, args);
  }
}
