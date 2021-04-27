package com.es.search.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author Administrator
 * @date 2021/4/18 21:32
 * @projectName search
 * @title: Script
 * @description: TODO
 */
@Data
@Document(indexName = "shakespeare_new")
public class Script {
    @Id
    private String id;

    @Field(name = "type" ,type = FieldType.Text, analyzer = "ik_smart")
    private String type;

    @Field(name="line_id" , type = FieldType.Integer)
    private Integer lineId;

    @Field(name="line_number" , type = FieldType.Text)
    private String lineNumber;

    @Field(name="play_name" , type = FieldType.Text, analyzer = "ik_smart")
    private String playName;

    @Field(name="speech_number" , type = FieldType.Integer)
    private Integer speechNumber;

    @Field(name="speaker" , type = FieldType.Text, analyzer = "ik_smart")
    private String speaker;

    @Field(name="text_entry" , type = FieldType.Text, analyzer = "ik_smart")
    private String textEntry;
}
