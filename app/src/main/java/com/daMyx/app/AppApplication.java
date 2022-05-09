package com.daMyx.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;

import com.daMyx.app.model.DB;

@SpringBootApplication
@RestController
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

    @GetMapping("/")
    public Object json(){
        DB db = new DB();
        Object obj = db.load_intial_audio_file();
        return obj;
    }
    // public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    // return String.format("Hello %s!", name);
    // }

}
