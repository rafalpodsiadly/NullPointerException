package pl.podsiadly.controller;


import java.math.BigInteger;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.podsiadly.model.Post;
import pl.podsiadly.service.PostService;


@RestController
@RequestMapping(value = "/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("")
    @Operation(summary = "getPosts")
    public List<Post> getPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("{id}")
    @Operation(summary = "getPostById")
    public Post getPostById(@PathVariable BigInteger id) {
        throw new IllegalArgumentException("Not Implementet yet getPostById: " + id);
    }

    @PostMapping
    @Operation(summary = "createNewPost")
    public Post createNewPost(@RequestBody Post posts) {
        throw new IllegalArgumentException("Not Implementet yet createNewPost ");
    }

    @PutMapping
    @Operation(summary = "updateNewPost")
    public Post updateNewPost(@RequestBody Post posts) {
        throw new IllegalArgumentException("Not Implementet yet updateNewPost ");
    }

    @DeleteMapping("{id}")
    @Operation(summary = "deleteById")
    public void deleteById(@PathVariable BigInteger id) {
        throw new IllegalArgumentException("Not Implementet yet deleteById: " + id);
    }
}
