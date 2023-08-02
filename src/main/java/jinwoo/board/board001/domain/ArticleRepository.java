package jinwoo.board.board001.domain;

import jinwoo.board.board001.domain.article.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository <ArticleEntity, Long> {
    List<ArticleEntity> findByWriterName(String writerName);
}
