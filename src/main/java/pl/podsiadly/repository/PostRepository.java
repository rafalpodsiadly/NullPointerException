package pl.podsiadly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.podsiadly.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
