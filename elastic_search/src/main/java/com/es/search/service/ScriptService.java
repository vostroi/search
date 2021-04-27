package com.es.search.service;

import com.es.search.bean.Script;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Administrator
 * @date 2021/4/19 11:26
 * @projectName search
 * @title: ScriptService
 * @description: TODO
 */
public interface ScriptService {

    /**
     * use scriptdao1
     * @param keyword
     * @return
     */
    Page<Script> search1(String keyword , Pageable pager);

    /**
     * use scriptdao2
     * @param keyword
     * @return
     */
    Page<Script> search2(String keyword , Pageable pager);

    Long countByLineId(int min, int max);


}
