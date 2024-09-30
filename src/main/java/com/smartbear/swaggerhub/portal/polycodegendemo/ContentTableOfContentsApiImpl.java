package com.smartbear.swaggerhub.portal.polycodegendemo;

import com.smartbear.swaggerhub.portal.polycodegendemo.apimodel.generated.controller.ContentTableOfContentsApi;
import com.smartbear.swaggerhub.portal.polycodegendemo.apimodel.generated.model.BaseTableOfContentsItem;
import com.smartbear.swaggerhub.portal.polycodegendemo.apimodel.generated.model.CreateTableOfContentsEntry201Response;
import com.smartbear.swaggerhub.portal.polycodegendemo.apimodel.generated.model.TableOfContentsItemCopy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentTableOfContentsApiImpl implements ContentTableOfContentsApi {
    @Override
    public ResponseEntity<CreateTableOfContentsEntry201Response> createTableOfContentsEntry(BaseTableOfContentsItem baseTableOfContentsItem) throws Exception {
        if (baseTableOfContentsItem instanceof TableOfContentsItemCopy) {
            return ResponseEntity.ok(new CreateTableOfContentsEntry201Response().helloMsg("Hello, copied item"));
        } else if (baseTableOfContentsItem instanceof BaseTableOfContentsItem) {
            return ResponseEntity.ok(new CreateTableOfContentsEntry201Response().helloMsg("Hello, new item"));
        } else {
            throw new Exception("Invalid request");
        }
    }
}
