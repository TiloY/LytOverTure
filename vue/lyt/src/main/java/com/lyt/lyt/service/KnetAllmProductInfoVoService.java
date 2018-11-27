package com.lyt.lyt.service;


import com.lyt.lyt.mapper.knet.KnetAllmProductInfoVoMapper;
import com.lyt.lyt.vo.knet.KnetAllmProductInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KnetAllmProductInfoVoService {
    @Autowired
    private KnetAllmProductInfoVoMapper knetAllmProductInfoVoMapper;

    public void mergeOne(KnetAllmProductInfoVo vo){
        knetAllmProductInfoVoMapper.mergeOne(vo);
    }
    public void insertOne(KnetAllmProductInfoVo vo){
        knetAllmProductInfoVoMapper.insertOne(vo);
    }
}
