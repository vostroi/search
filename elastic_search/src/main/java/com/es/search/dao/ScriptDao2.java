package com.es.search.dao;

import com.es.search.bean.Script;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 * @date 2021/4/19 11:19
 * @projectName search
 * @title: ScriptDao2
 * @description: use org.springframework.data.elasticsearch.repository.ElasticsearchRepository
 */
@Repository
public interface ScriptDao2 extends ElasticsearchRepository<Script , String> {

    Page<Script> findBySpeakerOrPlayNameOrTextEntry(String speaker , String playName , String textENtry , Pageable pager);

    Long countByLineIdBetween(int min, int max);


}
