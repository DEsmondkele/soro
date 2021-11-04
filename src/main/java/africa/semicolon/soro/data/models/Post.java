package africa.semicolon.soro.data.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
public class Post extends Storable {
        private Integer id;
        private String Title;
        private LocalDateTime Time;
        private String body;
        private List<Comment> comments;
}
