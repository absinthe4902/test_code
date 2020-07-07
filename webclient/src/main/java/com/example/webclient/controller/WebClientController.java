package com.example.webclient.controller;

import com.example.webclient.pojo.ResultFrom;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Seungmin lee
 * User: dnx
 * Date: 2020-06-18
 * Description:
 */
@RestController(value = "webClientController")
public class WebClientController {

    @GetMapping("/webclient/trigger")
    public String getTrigger() {
        WebClient webClient = WebClient.create("https://tpi.dnx.kr");

        Mono<String> result = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/dot/page/user/icon/")
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .log();

        System.out.println(result.block());
        return "return value";
    }

    @GetMapping("/webclient/trigger/post")
    public String postTrigger() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://tpi.dnx.kr")
                .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer k5awNpcJykAaA2mYM78SJ1iRvlnYbfUzU79oOSB5MYyquaveKh")
                .build();

        Map<String, Object> params = new HashMap<>();
        params.put("tag_id", 102);
        params.put("tag_name", "nodejs");
        params.put("tag_icon", 1);
        params.put("tag_color", "FFFFFF");

        Mono<String> result = webClient.post()
                .uri(uriBuilder -> uriBuilder
                        .path("/dot/tag/modify/")
                        .build())
                .body(Mono.just(params), HashMap.class)
                .retrieve()
                .bodyToMono(String.class);

        System.out.println(result.block());

        return result.block();
    }
}
