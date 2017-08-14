package com.example.service.es;

import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.stereotype.Service;

import com.example.util.ESManager;


@Service
public class QueryEsService {
	
	 public static void main(String args[]){
		 TransportClient client=ESManager.getTransportClient();
//		 String index="people_type_czrk";
//		 SearchRequestBuilder sqb= client.prepareSearch(index);
//		 sqb.setSearchType(SearchType.DFS_QUERY_THEN_FETCH);
//		 MatchQueryBuilder queryBuilder=QueryBuilders.matchQuery("ZJHM", "");
//		 sqb.setQuery(queryBuilder);
//		 SearchResponse searchResponse=sqb.execute().actionGet();
		 //遍历结果
		/* for(SearchHit hit:searchResponse.getHits()){
	            System.out.println(hit.getSourceAsString());
	            String data =  hit.getId() + "\n" + hit.getSourceAsString();
	      }*/
		 CreateIndexResponse cir= client.admin().indices().prepareCreate("pages").execute().actionGet();
		 
	 }

}
