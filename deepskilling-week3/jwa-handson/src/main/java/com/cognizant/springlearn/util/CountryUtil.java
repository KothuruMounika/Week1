package com.cognizant.springlearn.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.cognizant.springlearn.model.Country;

@Component
public class CountryUtil {

    public List<Country> getCountryList() {

        List<Country> countryList = new ArrayList<>();

        try {

            InputStream inputStream = getClass()
                    .getClassLoader()
                    .getResourceAsStream("country.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(inputStream);

            NodeList nodeList = document.getElementsByTagName("country");

            for (int i = 0; i < nodeList.getLength(); i++) {

                Element element = (Element) nodeList.item(i);

                String code = element.getElementsByTagName("code")
                        .item(0)
                        .getTextContent();

                String name = element.getElementsByTagName("name")
                        .item(0)
                        .getTextContent();

                Country country = new Country(code, name);

                countryList.add(country);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return countryList;
    }
}