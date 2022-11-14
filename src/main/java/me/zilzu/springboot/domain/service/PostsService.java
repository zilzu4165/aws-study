package me.zilzu.springboot.domain.service;

import me.zilzu.springboot.domain.posts.PostsRepository;
import me.zilzu.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;

@Service
public class PostsService {
    private final PostsRepository postsRepository;

    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }


}
