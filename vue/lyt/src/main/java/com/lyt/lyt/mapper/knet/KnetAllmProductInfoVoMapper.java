package com.lyt.lyt.mapper.knet;


import com.lyt.lyt.common.myMapper;
import com.lyt.lyt.vo.knet.KnetAllmProductInfoVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

@myMapper
public interface KnetAllmProductInfoVoMapper {

    @Insert("MERGE INTO knet_alm_product_info T1\n" +
            "USING (SELECT #{id} id FROM DUAL) T2\n" +
            "ON (T1.id = T2.id) WHEN MATCHED THEN\n" +
            "  UPDATE SET T1.modify_user = #{modifyUser}\n" +
            "WHEN NOT MATCHED THEN\n" +
            "  INSERT (id, modify_user) VALUES (#{id}, #{modifyUser})")
    void mergeOne(KnetAllmProductInfoVo vo);

    @Insert({"insert into knet_alm_product_info\n" +
            "  (id, modify_user)\n" +
            "values\n" +
            "  (#{id}, #{modifyUser})"})
    void insertOne(KnetAllmProductInfoVo vo);
}
