package com.mauhwi.icantremembermybuilds;

import com.mauhwi.icantremembermybuilds.model.Esoarmor;
import com.mauhwi.icantremembermybuilds.repo.ArmorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
