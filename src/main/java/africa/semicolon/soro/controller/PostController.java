package africa.semicolon.soro.controller;

import africa.semicolon.soro.data.models.Post;
import africa.semicolon.soro.dto.requests.CreatePostRequest;
import africa.semicolon.soro.dto.responses.CreatePostResponse;
import africa.semicolon.soro.dto.responses.FindPostResponse;
import africa.semicolon.soro.services.PostService;
import africa.semicolon.soro.services.PostServiceImpl;
import africa.semicolon.soro.utilities.exceptions.BlogException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    private final PostService postService = new PostServiceImpl();
@PostMapping("/api/post")
    public CreatePostResponse addPost(@RequestBody CreatePostRequest createPostRequest){
        return postService.addPost(createPostRequest);
    }
    @GetMapping("/api/post{id}")
    public FindPostResponse findPostById(@PathVariable("id") Integer id) throws BlogException {
        return  postService.findPostById(id);
    }
    @DeleteMapping("/api/post/{id}")
    public void deletePostById(@PathVariable Integer id){
        postService.deletePostById ( id );
    }

    @GetMapping("/api/post")
    public List<Post> findAll(){
        return postService.findAll ();
    }

}
