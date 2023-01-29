package com.demo.webflux_sse.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
//  We create a `@SpringBootTest`, starting an actual server on a `RANDOM_PORT`
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class FluxControllerTest {

    @Test
    @DisplayName("서버이벤트소비")
    public void consumeServerSentEvent() {
        WebClient client = WebClient.create("http://localhost:8080");
        ParameterizedTypeReference<ServerSentEvent<String>> type
                = new ParameterizedTypeReference<ServerSentEvent<String>>() {};

        Flux<ServerSentEvent<String>> eventStream = client.get()
//                .uri("/stream-sse")
                .uri("stream-flux")
                .retrieve()
                .bodyToFlux(type);

        eventStream.subscribe(
                // 성공적으로 수신했을 떄
                content -> log.info("Time: {} - event: name[{}], id [{}], content[{}] ",
                        LocalTime.now(), content.event(), content.id(), content.data()),
                // 에러가 발생했을 떄
                error -> log.error("Error receiving SSE: {}", error),
                // 스트리밍이 완료되었을 때
                () -> log.info("Completed!!!"));
    }

}