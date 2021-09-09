package com.adobe.aem.guides.wknd.core.models;

import org.apache.commons.lang.StringUtils;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TestImage {
    @ValueMapValue
    private String heading;

    @ValueMapValue
    private String text;

    public String getHeading() {
        return StringUtils.isNotBlank(heading) ? heading : "Default Value here!";
    }

    public String getText() {
        return StringUtils.isNotBlank(this.text) ? this.text.toUpperCase() : null;
    }
}
