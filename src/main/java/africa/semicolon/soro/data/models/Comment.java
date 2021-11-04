package africa.semicolon.soro.data.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;


@EqualsAndHashCode(callSuper = true)
@Data
public class Comment extends Storable{
    private  Integer id;
    private Integer PostId;
    private String comment;
    private  String commenter;
    private LocalDateTime time;

}
