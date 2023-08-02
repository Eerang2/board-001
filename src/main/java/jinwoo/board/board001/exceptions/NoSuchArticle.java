package jinwoo.board.board001.exceptions;

public class NoSuchArticle extends RuntimeException {
    public NoSuchArticle() {
        super("해당 게시물을 찾을 수가 없어요~~~");
    }

    public NoSuchArticle(String message) {
        super(message);
    }

    public NoSuchArticle(String message, Throwable cause) {
        super(message, cause);
    }
}
