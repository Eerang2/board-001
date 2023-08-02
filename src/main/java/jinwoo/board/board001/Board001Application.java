package jinwoo.board.board001;

import jinwoo.board.board001.domain.ArticleRepository;
import jinwoo.board.board001.domain.article.ArticleEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Board001Application {

    public static void main(String[] args) {
        SpringApplication.run(Board001Application.class, args);
    }


    @Bean
    public CommandLineRunner initData(ArticleRepository repository) {
        return (args) -> {
            repository.save(ArticleEntity.builder().title("1번째게시글의제목임").content("나는1번게시글의내용").writerName("지누").build());
            repository.save(ArticleEntity.builder().title("2번째게시글의제목임").content("나는2번게시글의내용").writerName("희지니").build());
        };
    }
}
