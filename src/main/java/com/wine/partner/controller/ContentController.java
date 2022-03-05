package com.wine.partner.controller;

import com.wine.partner.service.ContentService;
import com.wine.partner.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
public class ContentController {

    private final ContentService contentService;

    @GetMapping("/main")
    public ResponseEntity getMainContent() {
        String userId = SecurityUtil.getCurrentUserId()
                .orElseThrow(RuntimeException::new);
        contentService.getMainContent(userId);
        return ResponseEntity.ok("ok");
    }
}
