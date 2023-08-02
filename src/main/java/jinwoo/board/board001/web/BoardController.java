package jinwoo.board.board001.web;

import jinwoo.board.board001.domain.Article;
import jinwoo.board.board001.domain.ArticleService;
import jinwoo.board.board001.domain.article.ArticleEntity;
import jinwoo.board.board001.web.dto.ArticleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardController {

    final private ArticleService articleService;

    @GetMapping("/articles")
    public List<ArticleEntity> getArticles() {
        return articleService.getArticles();
    }

    @GetMapping("/articles-by-writerame")
    public List<ArticleEntity> getArticlesByWrtierName(@RequestParam("writername") String writerName) {
        return articleService.getArticlesByWriterName(writerName);
    }

    @GetMapping("/articles/{id}")
    public ArticleDto getArticleById(@PathVariable("id") Long id) {
        Article article = articleService.getArticleById(id);
        return ArticleDto.toArticleDtoByArticle(article);
    }
}