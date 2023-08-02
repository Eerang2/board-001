package jinwoo.board.board001.domain;

import jinwoo.board.board001.domain.article.ArticleEntity;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    Article getArticleById(Long id);


    List<ArticleEntity> getArticles();

    List<ArticleEntity> getArticlesByWriterName(String writerName);
}
