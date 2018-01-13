package com.org.gof.pattern.builder.component;

import java.util.List;

public class TextBuilder implements Builder {

    @Override
    public void buildHeader(HeaderModel headerModel) {
        sb.append(headerModel.getHeaderId() + "\n");
        sb.append(headerModel.getHeaderDescription() + "\n");
    }

    @Override
    public void buildBody(List<BodyModel> bodyModels) {
        bodyModels.forEach( bodyModel -> {
            sb.append(bodyModel.getSubjecId() + "\n");
            sb.append(bodyModel.getName() + "\n");
            sb.append(bodyModel.getDescription() + "\n");
        });

        sb.append("text body has special flavor" + "\n");
    }

    @Override
    public void buildFooter(FooterModel footerModel) {
        sb.append(footerModel.getFooterId() + "\n");
        sb.append(footerModel.getFooterDescription() + "\n");
    }
}



