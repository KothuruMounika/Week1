package com.cognizant.springlearn2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearn2Application {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearn2Application.class);

    public static void main(String[] args) throws Exception {

        LOGGER.info("START");

        SpringApplication.run(SpringLearn2Application.class, args);

        displayDate();

        LOGGER.info("END");
    }

    public static void displayDate() throws Exception {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);

        Date date = format.parse("31/12/2018");

        LOGGER.debug("Parsed Date : {}", date);

        LOGGER.info("END");
    }
}