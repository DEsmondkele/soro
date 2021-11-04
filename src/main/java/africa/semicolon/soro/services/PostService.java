package africa.semicolon.soro.services;

import africa.semicolon.soro.data.models.Post;
import africa.semicolon.soro.dto.requests.AddCommentRequest;
import africa.semicolon.soro.dto.requests.CreatePostRequest;
import africa.semicolon.soro.dto.responses.CreatePostResponse;
import africa.semicolon.soro.dto.responses.FindPostResponse;
import africa.semicolon.soro.utilities.exceptions.BlogException;

import java.util.List;

public interface PostService {

    CreatePostResponse addPost(CreatePostRequest createPostRequest);

    FindPostResponse findPostById(Integer id) throws BlogException;

    CreatePostResponse addComment(AddCommentRequest addCommentRequest);
    void deletePostById(Integer Id);
    List<Post> findAll();
}
