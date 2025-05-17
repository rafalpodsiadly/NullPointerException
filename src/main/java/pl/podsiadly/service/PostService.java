package pl.podsiadly.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.podsiadly.model.Post;
import pl.podsiadly.repository.PostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
