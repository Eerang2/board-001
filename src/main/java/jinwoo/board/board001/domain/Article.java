package jinwoo.board.board001.domain;

import jakarta.persistence.Id;
import jinwoo.board.board001.domain.article.ArticleEntity;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class Article {

    private Long id;

    private String title;

    private String content;

    private String writerName;

    private String writerId;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    public static Article toArticleByEntity(ArticleEntity entity) {
        return Article.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .writerName(entity.getWriterName())
                .writerId(entity.getWriterId())
                .createDate(entity.getCreateDate())
                .updateDate(entity.getUpdateDate())
                .build();
    }
}
