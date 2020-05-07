package com.relax.service.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 18:53
 */
public class ElasticsearchConfig {
    @Value("${relax.elasticsearch.ES_HOST_LIST}")
    private String ES_HOST_LIST;

    @Bean
    public RestHighLevelClient restHighLevelClient(){
        //解析ES_HOST_LIST配置信息
        String[] split = ES_HOST_LIST.split(",");
        //创建HttpHost数组，其中存放es主机和端口的配置信息
        HttpHost[] httpHostArray = new HttpHost[split.length];
        for(int i=0;i<split.length;i++){
            String item = split[i];
            httpHostArray[i] = new HttpHost(item.split(":")[0], Integer.parseInt(item.split(":")[1]), "http");
        }
        //创建RestHighLevelClient客户端
        return new RestHighLevelClient(RestClient.builder(httpHostArray));
    }

    /** 项目主要使用RestHighLevelClient，对于低级的客户端暂时不用 */
    @Bean
    public RestClient restClient(){
        //解析ES_HOST_LIST配置信息
        String[] split = ES_HOST_LIST.split(",");
        //创建HttpHost数组，其中存放es主机和端口的配置信息
        HttpHost[] httpHostArray = new HttpHost[split.length];
        for(int i=0;i<split.length;i++){
            String item = split[i];
            httpHostArray[i] = new HttpHost(item.split(":")[0], Integer.parseInt(item.split(":")[1]), "http");
        }
        return RestClient.builder(httpHostArray).build();
    }

}