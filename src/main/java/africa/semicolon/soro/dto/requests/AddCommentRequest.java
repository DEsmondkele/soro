package africa.semicolon.soro.dto.requests;

import lombok.Data;

@Data
public class AddCommentRequest {
    private  Integer id;
    private  String commenter;
    private  String comment;


}
