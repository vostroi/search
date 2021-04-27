package com.es.search.service.impl;

import com.es.search.bean.Script;
import com.es.search.dao.ScriptDao1;
import com.es.search.dao.ScriptDao2;
import com.es.search.service.ScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2021/4/19 11:32
 * @projectName search
 * @title: ScriptServiceImpl
 * @description: TODO
 */
@Service
public class ScriptServiceImpl implements ScriptService {
    @Autowired private ScriptDao1 sdao1;

    @Autowired private ScriptDao2 sdao2;

    @Override
    public Page<Script> search1(String keyword, Pageable pager) {
        return sdao1.findBySpeakerOrPlayNameOrTextEntry(keyword, keyword, keyword, pager);
    }

    @Override
    public Page<Script> search2(String keyword, Pageable pager) {
        return sdao2.findBySpeakerOrPlayNameOrTextEntry(keyword, keyword, keyword, pager);
    }

    @Override
    public Long countByLineId(int min, int max) {
        return sdao2.countByLineIdBetween(min, max);
    }
}
