package africa.semicolon.soro.services;

import africa.semicolon.soro.data.models.Comment;
import africa.semicolon.soro.data.models.Post;
import africa.semicolon.soro.data.repositories.CommentRepository;
import africa.semicolon.soro.data.repositories.PostRepository;
import africa.semicolon.soro.dto.requests.AddCommentRequest;
import africa.semicolon.soro.dto.requests.CreatePostRequest;
import africa.semicolon.soro.dto.responses.CreatePostResponse;
import africa.semicolon.soro.dto.responses.FindPostResponse;
import africa.semicolon.soro.utilities.ModelMapper;
import africa.semicolon.soro.utilities.exceptions.BlogException;

import javax.swing.text.BadLocationException;
import java.util.List;
import java.util.Optional;

public class PostServiceImpl implements PostService {
    private final CommentRepository commentRepository =new CommentRepository();
    private  final PostRepository repository = new PostRepository();
    @Override
    public CreatePostResponse addPost(CreatePostRequest createPostRequest) {
        Post post = ModelMapper.map(createPostRequest);
         post= repository.save(post);
         return ModelMapper.map(repository.save(post));
    }

    @Override
    public FindPostResponse findPostById(Integer id) throws BlogException {
        Optional<Post>post =repository.findById(id);
        if(post.isEmpty())throw  new BlogException("No such post exist");
        return  ModelMapper.mapFindPostResponse(post.get());
    }
    @Override
    public CreatePostResponse addComment(AddCommentRequest addCommentRequest){
Optional<Post> post = repository.findById(addCommentRequest.getId());
if(post.isEmpty()) throw  new BlogException("Post does not exist");
    Comment comment =ModelMapper.map(addCommentRequest);
        comment= commentRepository.save(comment);
Post updatedPost = post.get();
updatedPost.getComments().add(comment);
repository.save(updatedPost);
return  ModelMapper.map(updatedPost);
    }

    @Override
    public void deletePostById(Integer Id) {
        repository.delete(Id);
    }

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

}
