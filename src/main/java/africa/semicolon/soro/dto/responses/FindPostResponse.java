package africa.semicolon.soro.dto.responses;

import africa.semicolon.soro.data.models.Comment;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class FindPostResponse {
    private String title;
    private String body;
    private LocalDateTime datePublished;
    private List<Comment> comments;

}
