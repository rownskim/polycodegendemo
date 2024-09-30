package com.smartbear.swaggerhub.portal.polycodegendemo;

import com.smartbear.swaggerhub.portal.polycodegendemo.apimodel.generated.controller.ContentTableOfContentsApi;
import com.smartbear.swaggerhub.portal.polycodegendemo.apimodel.generated.model.BaseTableOfContentsItem;
import com.smartbear.swaggerhub.portal.polycodegendemo.apimodel.generated.model.CreateTableOfContentsEntry201Response;
import org.springframework.http.ResponseEntity;

public class ContentTableOfContentsApiImpl implements ContentTableOfContentsApi {
    @Override
    public ResponseEntity<CreateTableOfContentsEntry201Response> createTableOfContentsEntry(BaseTableOfContentsItem baseTableOfContentsItem) throws Exception {
        return null;
    }
}
