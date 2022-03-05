package com.wine.partner.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoginRequest {
    @JsonProperty("user_id")
    private String userId;
    private String password;
}
