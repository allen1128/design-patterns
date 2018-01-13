package com.org.gof.pattern.builder;

import com.org.gof.pattern.builder.component.*;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        //data
        HeaderModel headerModel = new HeaderModel("header1", "sample header");
        List<BodyModel> bodyModelList = new ArrayList<BodyModel>();
        bodyModelList.add(new BodyModel("body1", "body name 1", "body 1st description"));
        bodyModelList.add(new BodyModel("body2", "body name 2", "body 2nd description"));
        bodyModelList.add(new BodyModel("body3", "body name 3", "body 3rd description"));

        FooterModel footerModel = new FooterModel("footer1", "sample footer");

        //builder
        Builder textbuilder = new TextBuilder();
        Director director = new Director(textbuilder);
        director.construct(headerModel, bodyModelList, footerModel);
        System.out.println(textbuilder.getResult());

        Builder xmlBuilder = new XmlBuilder();
        director.setBuilder(xmlBuilder);
        director.construct(headerModel, bodyModelList, footerModel);
        System.out.println(xmlBuilder.getResult());
    }
}

