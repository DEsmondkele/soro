package africa.semicolon.soro.controller;

import africa.semicolon.soro.dto.requests.AddCommentRequest;
import africa.semicolon.soro.dto.responses.CreatePostResponse;
import africa.semicolon.soro.services.PostService;
import africa.semicolon.soro.services.PostServiceImpl;
import africa.semicolon.soro.utilities.exceptions.BlogException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    private final PostService postService= new PostServiceImpl();

    @PostMapping("/api/comment")
    public CreatePostResponse addComment(@RequestBody AddCommentRequest addCommentRequest) throws BlogException {
        return postService.addComment(addCommentRequest);
    }
}
