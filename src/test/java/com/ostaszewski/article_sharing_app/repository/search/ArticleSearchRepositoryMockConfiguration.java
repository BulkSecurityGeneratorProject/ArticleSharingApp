package com.ostaszewski.article_sharing_app.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of ArticleSearchRepository to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class ArticleSearchRepositoryMockConfiguration {

    @MockBean
    private ArticleSearchRepository mockArticleSearchRepository;

}
