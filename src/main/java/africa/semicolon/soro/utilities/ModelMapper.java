package africa.semicolon.soro.utilities;

import africa.semicolon.soro.data.models.Comment;
import africa.semicolon.soro.data.models.Post;
import africa.semicolon.soro.dto.requests.AddCommentRequest;
import africa.semicolon.soro.dto.requests.CreatePostRequest;
import africa.semicolon.soro.dto.responses.CreatePostResponse;
import africa.semicolon.soro.dto.responses.FindPostResponse;

import java.time.LocalDateTime;

public class ModelMapper {

    public static Post map(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        post.setTime(LocalDateTime.now());
        return post;
    }

    public static CreatePostResponse map(Post post) {
        CreatePostResponse createPostResponse = new CreatePostResponse();
        createPostResponse.setId(post.getId());
        createPostResponse.setTitle(post.getTitle());
        return createPostResponse;
    }

    public static FindPostResponse mapFindPostResponse(Post post) {
        FindPostResponse findPostResponse = new FindPostResponse();
        findPostResponse.setBody(post.getBody());
        findPostResponse.setTitle(post.getTitle());
        findPostResponse.setComments(post.getComments());
        findPostResponse.setDatePublished(post.getTime());
        return findPostResponse;
    }


    public static Comment map(AddCommentRequest addCommentRequest) {
            Comment comment = new Comment ();
            comment.setComment ( addCommentRequest.getComment () );
            comment.setPostId ( addCommentRequest.getId () );
            comment.setId ( addCommentRequest.getId () );
            comment.setTime ( LocalDateTime.now () );
            comment.setCommenter ( addCommentRequest.getCommenter () );
            return comment;
        }

    }

