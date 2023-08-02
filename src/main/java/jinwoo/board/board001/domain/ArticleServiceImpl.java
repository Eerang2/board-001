package jinwoo.board.board001.domain;

import jinwoo.board.board001.domain.article.ArticleEntity;
import jinwoo.board.board001.exceptions.NoSuchArticle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    final private ArticleRepository articleRepository;


    @Override
    public Article getArticleById(Long id) {
        ArticleEntity entity = articleRepository.findById(id).orElseThrow(() -> new NoSuchArticle());
        return Article.toArticleByEntity(entity);
    }

    @Override
    public List<ArticleEntity> getArticles() {
        return articleRepository.findAll();
    }


    @Override
    public List<ArticleEntity> getArticlesByWriterName(String writerName) {
        return articleRepository.findByWriterName(writerName);
    }
}
