package com.es.search.dao;

import com.es.search.bean.Script;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author Administrator
 * @date 2021/4/19 11:03
 * @projectName search
 * @title: ScriptDao1
 * @description: use org.elasticsearch.repositories.Repository
 */
@org.springframework.stereotype.Repository
public interface ScriptDao1 extends Repository<Script, String> {

    Page<Script> findBySpeakerOrPlayNameOrTextEntry(String speaker , String playName , String textENtry , Pageable pager);
}
