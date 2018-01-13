package com.org.gof.pattern.builder.component;

import java.util.List;

public class XmlBuilder implements Builder {
    @Override
    public void buildHeader(HeaderModel headerModel) {
        sb.append("<?xml version='1.0' encoding='gb2312' ?>\n");
        sb.append("<report>\n");
        sb.append("<header>\n");
        sb.append("<header_id>" + headerModel.getHeaderId() +"</header_id>\n");
        sb.append("<header_description>" + headerModel.getHeaderId() +"</header_description>\n");
        sb.append("</header>");
    }

    @Override
    public void buildBody(List<BodyModel> bodyModels) {
        bodyModels.forEach( bodyModel -> {
            sb.append("<subject>\n" );
            sb.append("<subject_id>" + bodyModel.getSubjecId() + "</subject_id>\n" );
            sb.append("<subject_name>" + bodyModel.getName() + "</subject_name>\n");
            sb.append("<subject_description>" + bodyModel.getDescription() + "</subject_description>\n");
            sb.append("</subject>\n" );
        });
    }

    @Override
    public void buildFooter(FooterModel footerModel) {
        sb.append("<footer>");
        sb.append("<only_xml>go here</only_xml>");
        sb.append("<footer_id>" + footerModel.getFooterId() + "</footer_id>");
        sb.append("<footer_description>" + footerModel.getFooterId() + "</footer_description>");
        sb.append("</footer>");
        sb.append("</report>");
    }
}
