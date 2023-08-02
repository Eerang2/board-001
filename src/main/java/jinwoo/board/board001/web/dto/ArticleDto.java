package jinwoo.board.board001.web.dto;

import jinwoo.board.board001.domain.Article;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class ArticleDto {

    private Long id;

    private String title;

    private String content;

    private String writerName;

    private String writerId;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    public static ArticleDto toArticleDtoByArticle(Article article) {
        return ArticleDto.builder()
                .id(article.getId())
                .title(article.getTitle())
                .content(article.getContent())
                .writerName(article.getWriterName())
                .writerId(article.getWriterId())
                .createDate(article.getCreateDate())
                .updateDate(article.getUpdateDate())
                .build();
    }
}
