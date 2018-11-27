package com.lyt.lyt.mapper.mongodb;

import com.lyt.lyt.vo.mongodb.CmsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TestMongDBReppository {
    @Autowired
    private MongoTemplate mo ;

    public List<CmsPage> test(){
      return   mo.findAll(CmsPage.class);
    }
}
