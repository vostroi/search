package com.es.search.controller;

import com.es.search.bean.Script;
import com.es.search.service.ScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2021/4/19 11:24
 * @projectName search
 * @title: ScriptController
 * @description: TODO
 */
@RestController
@RequestMapping(value="/script")
public class ScriptController {

    @Autowired private ScriptService scriptService;

    /**
     * @param keyword
     * @param page
     * @param size
     * @param sort 排序规则
     * @param order 排序字段
     * @return
     */
    @GetMapping(value = "/search1")
    public Object doSearch1(String keyword , @RequestParam(value="page" , required = false , defaultValue = "1") int page ,
                                           @RequestParam(value = "size" , required = false , defaultValue = "5") int size ,
                                           @RequestParam(value = "order" , required = false , defaultValue = "lineId") String order ,
                                           @RequestParam(value = "sort" , required = false , defaultValue = "ASC") String sort){
        PageRequest pager = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sort), order));
        return scriptService.search1(keyword , pager);
    }

    @GetMapping(value = "/search2")
    public Page<Script> doSearch2(String keyword , @RequestParam(value="page" , required = false , defaultValue = "1") int page ,
                                  @RequestParam(value = "size" , required = false , defaultValue = "5") int size ,
                                  @RequestParam(value = "order" , required = false , defaultValue = "lineId") String order ,
                                  @RequestParam(value = "sort" , required = false , defaultValue = "ASC") String sort){
        PageRequest pager = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sort), order));
        return scriptService.search2(keyword , pager);
    }

    public Long countByLineId(Integer min , Integer max){
        return scriptService.countByLineId(min, max);
    }

}
