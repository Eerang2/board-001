package jinwoo.board.board001.domain.article;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@Setter
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String writerName;

    private String writerId;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    @Builder
    public ArticleEntity(Long id, String title, String content, String writerName, String writerId, LocalDateTime createDate, LocalDateTime updateDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writerName = writerName;
        this.writerId = writerId;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
}