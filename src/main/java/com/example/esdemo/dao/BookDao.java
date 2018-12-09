package com.example.esdemo.dao;

import com.example.esdemo.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookDao extends ElasticsearchRepository<Book, String> {
}
