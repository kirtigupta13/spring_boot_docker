package io.egens.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * First
 * then go to servelet inizilizar
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "io.egens")
public class WebConfig 
{
   
}
